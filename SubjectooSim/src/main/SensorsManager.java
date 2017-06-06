package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class SensorsManager
{

	private static HashMap<Integer,Sensor>sensorsList = new HashMap<Integer,Sensor>();
	private static HashMap<Integer,SubjectiveOpinion> reputationList = new HashMap<Integer,SubjectiveOpinion>();
	private static double PMThreshold = 7.2 ;
	private static HashMap<Integer,Double> evidenceFor = new HashMap<Integer,Double>();
	private static HashMap<Integer,Double> evidenceAgainst = new HashMap<Integer,Double>();

	public static void registerSensor(int id, double xCoordinate, double yCoordinate) throws Exception
	{
		Thread registerOperation = new Thread() 
		{

			@Override
			public void run() 
			{
				if(sensorsList.containsKey(id))
				{
					System.err.println("Already Exisisting Sensor");
					return;
				}
				else
				{
					Sensor newSensor = new Sensor(id,xCoordinate,yCoordinate);
					sensorsList.put(id, newSensor);
					SubjectiveOpinion newOpinion = new SubjectiveOpinion(0,0,1,0.5);
					reputationList.put(id, newOpinion);	
					evidenceFor.put(id,0.0);
					evidenceAgainst.put(id,0.0);

				}

			}
		};

		registerOperation.start();
	}

	public static boolean setAlarm()
	{
		double finalReading = 0.0 ;
		double sensorsSummation = 0.0;
		double weightsSummation = 0.0;
		SubjectiveOpinion firstOpinion = null;
		ArrayList<SubjectiveOpinion> toGetCumulated = new ArrayList<SubjectiveOpinion>();
		Date now = new Date();
		now.setHours(now.getHours()-1);

		for(Sensor s: sensorsList.values())
		{
			
			if(s.getSensorOpinion()== null)
				continue;
			if(s.getLastReadingStamp().before(now))
			{
				// remove sensors inactive for a week ..............................
				continue;
			}

			sensorsSummation += s.getFineDustReading()*s.getSensorOpinion().getExpectation();
			weightsSummation += s.getSensorOpinion().getExpectation();
			SubjectiveOpinion serversOpinion = s.getSensorOpinion().discountBy(reputationList.get(s.getId()));
			if(firstOpinion == null)
				firstOpinion = serversOpinion;
			else
				toGetCumulated.add(serversOpinion);
		}

		finalReading = sensorsSummation/weightsSummation;
		SubjectiveOpinion finalDecision = firstOpinion.fuse(toGetCumulated);

		updateReputations(finalReading,finalDecision);
		nullifyAll();

		return PMThreshold>=finalReading-finalReading*(1-finalDecision.getExpectation()) &&
				PMThreshold<=finalReading+finalReading*(1-finalDecision.getExpectation());

	}

	private static void nullifyAll()
	{
		for(Sensor s: sensorsList.values())
		{
			s.setSensorOpinion(null);
			s.setBatteryLevel(0.0);
			s.setActive(false);
			s.setFineDustReading(-1.0);   
		}
		
	}

	private static void updateReputations(double finalReading, SubjectiveOpinion finalDecision) 
	{
		// reputations change mid calculations
		HashMap<Integer,SubjectiveOpinion> updatedReputations = new HashMap<Integer,SubjectiveOpinion>();
		HashMap<Integer,SubjectiveOpinion> oldOpinions = new HashMap<Integer,SubjectiveOpinion>();
		for (Sensor updatedSensor : sensorsList.values())
		{
			double cumuliativeResult = 0.0;
			double sensorsSummation = 0.0;
			double sensorsSquare = 0.0;
			double weightsSummation = 0.0;
			SubjectiveOpinion firstOpinion = null;
			ArrayList<SubjectiveOpinion> toGetCumulated = new ArrayList<SubjectiveOpinion>();
			for(Sensor s: sensorsList.values())
			{
				if(updatedSensor == s)
					continue;
				
				if(s.getSensorOpinion()== null)
					continue;

				sensorsSummation += s.getFineDustReading()*s.getSensorOpinion().getExpectation();
				sensorsSquare += (Math.pow(s.getFineDustReading(),2))*s.getSensorOpinion().getExpectation();
				weightsSummation += s.getSensorOpinion().getExpectation();
				SubjectiveOpinion serversOpinion = s.getSensorOpinion().discountBy(reputationList.get(s.getId()));
				if(firstOpinion == null)
					firstOpinion = serversOpinion;
				else
					toGetCumulated.add(serversOpinion);
			}
			
			// Create cumulation result and cumulative deviation without the sensor to be added, *reading sent before updating the reputations		
			cumuliativeResult = sensorsSummation/weightsSummation;
			double meanOfSquaredValues  = sensorsSquare/weightsSummation;
			double readingsDeviation = Math.sqrt(meanOfSquaredValues - (Math.pow(cumuliativeResult, 2)));
			SubjectiveOpinion cumulativeDecision = firstOpinion.fuse(toGetCumulated);
			
			
			
		}
	}
	
	private static double modelPredictionRoadLength(double ELEV, double COMM, double RES, double IND)
	{
		// define units and revise COMM.300 RES.750 & IND.300
		return 0.036- ELEV*0.019 + COMM * 2.58 + RES * 0.035 + IND * 0.319;				
	}
	
	private static double modelPredictionVeichleDensity(double AD, double ELEV, double COMM, double RES)
	{
		// define units and revise COMM.300 AD.100 & RES.750
		return 1.01 + AD * 0.002 - ELEV * 0.018 + COMM * 2.88 + RES * 0.025;
	}



}