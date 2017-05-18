package main;

import java.util.HashMap;

import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class SensorsManager
{

	HashMap<Integer,Sensor>sensorsList = new HashMap<Integer,Sensor>();
	HashMap<Integer,SubjectiveOpinion> reputationList = new HashMap<Integer,SubjectiveOpinion>();

	public void registerSensor(int id, double xCoordinate, double yCoordinate) throws Exception
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



}
