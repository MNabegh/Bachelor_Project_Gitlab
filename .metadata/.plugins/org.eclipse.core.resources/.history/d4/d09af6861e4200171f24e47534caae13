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
		ArrayList<SubjectiveOpinion> toGetCumiliated = new ArrayList<SubjectiveOpinion>();
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
				toGetCumiliated.add(serversOpinion);
		}

		finalReading = sensorsSummation/weightsSummation;
		SubjectiveOpinion finalDecision = firstOpinion.fuse(toGetCumiliated);

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
		
	}



}
