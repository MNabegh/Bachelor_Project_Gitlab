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
	private static Object lock = new Object();
	private static int err = 0;
	private static int err1 = 0;
	
	public static void registerSensor(int id, double xCoordinate, double yCoordinate) throws Exception
	{		
				if(sensorsList.containsKey(id))
				{
					System.err.println("Already Exisisting Sensor");
					return;
				}
				else
				{
					Sensor newSensor = new Sensor(id,xCoordinate,yCoordinate);
					SubjectiveOpinion newOpinion = new SubjectiveOpinion(0,0,1,0.5);
					synchronized (lock)
					{
						sensorsList.put(id, newSensor);
						reputationList.put(id, newOpinion);	
						evidenceFor.put(id,0.0);
						evidenceAgainst.put(id,0.0);
					}
				}
	}
	
	public static void recieveReading (int id, double fineDustReading, int pos)
	{
		//sensorsList.get(id).recieveReading(batteryLevel, fineDustReading, pos);
		sensorsList.get(id).recieveReading(fineDustReading, pos);
	}

	public static boolean setAlarm(int pos)
	{
		double finalReading = 0.0 ;
		double sensorsSummation = 0.0;
		double weightsSummation = 0.0;
		SubjectiveOpinion firstOpinion = null;
		ArrayList<SubjectiveOpinion> toGetCumulated = new ArrayList<SubjectiveOpinion>();
		//Date now = new Date();
		//now.setHours(now.getHours()-1);
		//System.out.println("SetAlarm");

		for(Sensor s: sensorsList.values())
		{

			if(s.getSensorOpinion()== null)
				continue;
			/*if(s.getLastReadingStamp().before(now))
			{
				// remove sensors inactive for a week ..............................
				continue;
			}*/

			sensorsSummation += s.getFineDustReading()[pos]*s.getSensorOpinion().getExpectation();
			weightsSummation += s.getSensorOpinion().getExpectation();
			//System.out.println(s.getId()+" "+reputationList.get(s.getId()));
			SubjectiveOpinion serversOpinion = s.getSensorOpinion().discountBy(reputationList.get(s.getId()));
			if(firstOpinion == null)
				firstOpinion = serversOpinion;
			else
				toGetCumulated.add(serversOpinion);
		}

		finalReading = sensorsSummation/weightsSummation;
		if(toGetCumulated.isEmpty())
		{
			//System.err.println(++err);
			return false;
		}
		SubjectiveOpinion finalDecision = firstOpinion.fuse(toGetCumulated);

		updateReputations(finalReading,finalDecision, pos);
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
		}

	}

	private static void updateReputations(double finalReading, SubjectiveOpinion finalDecision, int pos) 
	{
		HashMap<Integer, SubjectiveOpinion> updatedReputations= new HashMap<Integer,SubjectiveOpinion>();
		
		for (Sensor updatedSensor : sensorsList.values())
		{
			if(updatedSensor.getSensorOpinion() == null)
				continue;
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

				sensorsSummation += s.getFineDustReading()[pos]*s.getSensorOpinion().getExpectation();
				sensorsSquare += (Math.pow(s.getFineDustReading()[pos],2))*s.getSensorOpinion().getExpectation();
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
			if(toGetCumulated.isEmpty())
			{
				//System.err.println(++err1);
				return ;
			}
			SubjectiveOpinion cumulativeDecision = firstOpinion.fuse(toGetCumulated);

			double readingUnaccruacy = updatedSensor.getFineDustReading()[pos]*(1-updatedSensor.getSensorOpinion().getExpectation());		
			double [] readings = {updatedSensor.getFineDustReading()[pos], 
					updatedSensor.getFineDustReading()[pos]-readingUnaccruacy, 
					updatedSensor.getFineDustReading()[pos]+readingUnaccruacy};
			double decisionWieght = -1.0;
			boolean flag = false; //evidence Against

			// most trustworthyReading approach to eliminate the effect of the battery consumption
			for (double reading: readings)
			{
				if(reading<cumuliativeResult)
				{
					if(reading>cumuliativeResult-readingsDeviation)
					{
						if(!flag || (flag && decisionWieght<reading - (cumuliativeResult-readingsDeviation)))
						{
							decisionWieght = reading - (cumuliativeResult-readingsDeviation);
							flag = true;
						}
					}

					else

						if(decisionWieght == -1.0 || (!flag && decisionWieght>(
								cumuliativeResult-readingsDeviation) - reading))
							decisionWieght = (cumuliativeResult-readingsDeviation) - reading;
				}
				else 
				{
					if(reading<cumuliativeResult+readingsDeviation)
					{
						if(!flag || (flag && decisionWieght<(cumuliativeResult+readingsDeviation) - reading))
						{
							decisionWieght = (cumuliativeResult+readingsDeviation) - reading;
							flag = true;
						}
					}

					else

						if(decisionWieght == -1.0 || (!flag && decisionWieght>reading - 
								(cumuliativeResult+readingsDeviation)))
						{
							decisionWieght = reading - (cumuliativeResult+readingsDeviation) ;
						}
				}
			}
			
			//System.out.println(decisionWieght+" "+flag+" ");
			
			if(flag)
				evidenceFor.put(updatedSensor.getId(), evidenceFor.get(updatedSensor.getId())+decisionWieght);
			else
				evidenceAgainst.put(updatedSensor.getId(), evidenceAgainst.get(updatedSensor.getId())+decisionWieght);
			double belief = evidenceFor.get(updatedSensor.getId())/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double disbelief = evidenceAgainst.get(updatedSensor.getId())/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double uncertainity = 2/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double atomicity = reputationList.get(updatedSensor.getId()).getAtomicity();
			//System.out.println(evidenceFor.get(updatedSensor.getId())+" "+(evidenceFor.get(updatedSensor.getId())
					//+" "+ evidenceAgainst.get(updatedSensor.getId())+" "+2)+ " hgruejhiwoere");
			SubjectiveOpinion updatedReputation = new SubjectiveOpinion(belief,disbelief,uncertainity,atomicity);
			updatedReputations.put(updatedSensor.getId(), updatedReputation);
		}
		for (int sensor : updatedReputations.keySet())
		{
			reputationList.put(sensor, updatedReputations.get(sensor));			
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
	
	public static void SimulateDay()
	{
		for(int i=0;i<24;i++)
		{
			setAlarm(i);
		}
		
	}

	public static HashMap<Integer, Sensor> getSensorsList() {
		return sensorsList;
	}


}
