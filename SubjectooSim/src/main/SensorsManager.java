package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class SensorsManager
{

	private static HashMap<Integer,Sensor>sensorsList = new HashMap<Integer,Sensor>();  // List of all registered Sensors, key is the sensor id and value is the sensor object
	private static HashMap<Integer,SubjectiveOpinion> reputationList = new HashMap<Integer,SubjectiveOpinion>(); // List of the opinions of the server about the each sensprs key is sensor id and value is the subjective opinion
	private static double PMThreshold = 25 ; // threshold of EU standards for quality of air for PM2.5
	private static HashMap<Integer,Double> evidenceFor = new HashMap<Integer,Double>(); // evidence to support the honesty of the sensor, key is sensor id and value is the numeric value of the evidence
	private static HashMap<Integer,Double> evidenceAgainst = new HashMap<Integer,Double>(); // evidence that proofs the dishonesty of the sensor, key is the sensor id and value is the numeric value
	private static Object lock = new Object(); // lock object for synchronization of the code 
	private static double decayFactor ; // weight of previous evidences help decrease the weight of the evidences as time passes since they had been collected

	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";

	//CSV file header
	private static final String FILE_HEADER = "day,hour,SensorID,reading,belief,disbelief,uncertainity,atomicity,expectation,final Reading";
	private static final String FILE_HEADER_2 = "day,hour,Final Reading, belief,disbelief,uncertainity,atomicity,expectation";

	//Testing
	private static ArrayList<Integer> Participation = new ArrayList<Integer>(); // List of Attacker nodes
	private static int countHours = 0; // counter for the simulation time
	private static boolean lastSensor = false; // flag that the last sensor has joined the network
	private static boolean attack = false; // flag that the enough time passed for the system to stabilize and attacking nodes can start their attack
	private static String directory ; // directory in which the results are saved 
	private static boolean first ; // using the first approach or the second explained later in the code
	private static int addedValue; // the value by which attackers are trying to move their 
	private static String SimDate ; // date when the simulation starts helps randomize the start date
	private static int attackingPeriod ; // the period for which the attack will last to stop the simulation, in the simulation with no attacks we use the total simulation time instead
	private static boolean sim; // flag signals the start of the simulation
	private static int periodLength;
	private static int frequencyOfAttack;
	private static int timeToStartAttack;
	private static int timeToEndAttack;
	private static int attacksCount ;
	private static int nextAttack;

	public static int getNextAttack() {
		return nextAttack;
	}

	public static void setNextAttack(int nextAttack) {
		SensorsManager.nextAttack = nextAttack;
	}

	public static void registerSensor(int id, double xCoordinate, double yCoordinate) throws Exception
	{		
		if(sensorsList.containsKey(id))
		{
			System.err.println("Already Exisisting Sensor"); // logically should not be reached easier than implementing an exception
			return;
		}
		else
		{
			SubjectiveOpinion [] array = new SubjectiveOpinion[24]; // list of sensor's opinion about readings from every hour in the day
			Sensor newSensor = new Sensor(id,xCoordinate,yCoordinate,array); // create a new sensor object for the new sensor
			SubjectiveOpinion newOpinion = new SubjectiveOpinion(0,0,1,0.5); // server's initial opinion about the sensor is a vacuous one
			if(id==3323) // signal the joining of the last sensor
				lastSensor=true;
			synchronized (lock) // prevent any other threads from copying the lists and writing to it as other threads are attempting the same
			{
				sensorsList.put(id, newSensor); // add the sensor to the sensors' list
				reputationList.put(id, newOpinion);	 // add the vacuous as the server's current opinion on the new sensor
				evidenceFor.put(id,0.0); // no evidence collected yet
				evidenceAgainst.put(id,0.0);
			}
		}
	}

	public static void recieveReading (int id, double fineDustReading, int pos, double x, double y)
	{
		sensorsList.get(id).recieveReading(fineDustReading, pos,x,y); // identifies the sensor by id and forward the reading to the sensor object to save the reading
	}

	public static int getCountHours()
	{
		return countHours;
	}

	public static boolean setAlarm(int pos, String date) // method to produce final estimation of the level of fine dust in the area
	{
		double finalReading = 0.0 ; // variable to save the final estimation
		double sensorsSummation = 0.0; // variable for summing all the valid sensor readings
		double weightsSummation = 0.0; // variable for summing all of the weights of each sensor's reading
		ArrayList<SubjectiveOpinion> toGetCumulated = new ArrayList<SubjectiveOpinion>(); // list of all of the opinions that will be cumulated

		if(date.equals(SimDate)) // change the flag to start the simulation to true when the start date comes
			sim=true;

		if(!sim) // stops the program from simulating the day in case the date to has not come yet
			return false;

		if(!attack && attacksCount>10) // stops the simulation if the simulation period is over
			return false;

		//----------------------------------------------- Loop on all sensors to prepare to produce the final reading and calculate the values of some of the above variables --------------------------------------------------

		for(Sensor s: sensorsList.values()) // l
		{

			if(s.getSensorOpinion()[pos]== null) // means this sensor has not received readings for this hour
				continue;

			if(reputationList.get(s.getId()).getBelief()<0.1 && reputationList.get(s.getId()).getUncertainty()<0.5)// blocking sensors with very low belief in them and enough evidence to support that
			{
				continue;
			}

			if(countHours==nextAttack) // change the flag to start the attack to true
			{
				attack=true;
				timeToEndAttack = periodLength; // start attack period
				nextAttack = frequencyOfAttack+countHours; // attack is ongoing
				attacksCount++;
			}


			//-------------Attack------------------------------------------------------------------------------------------------------------		
			if(Participation.contains(s.getId()) && attack ) // 
			{
				if(addedValue==-1)
				{
					Random r = new Random(); // create random object
					s.getFineDustReading()[pos]=r.nextInt(51); // inject random reading instead of using actual readings
				}
				else
					s.getFineDustReading()[pos]=s.getFineDustReading()[pos]+addedValue; // try to move the current reading by a certain value
			}
			//---------------------------------------------------------------------------------------------------------------------------------

			SubjectiveOpinion serversOpinion = s.getSensorOpinion()[pos].discountBy(reputationList.get(s.getId())); // servers final opinion about the node's reading 
			sensorsSummation += s.getFineDustReading()[pos]*serversOpinion.getExpectation(); // add the sensor's reading to the weighted summation of all available sensors' readings
			weightsSummation += serversOpinion.getExpectation(); // add the weight of this sensor to the weights summation
			toGetCumulated.add(serversOpinion); // add the server's opinion about the sensor to the list of opinions about the sensors, that were taken into consideration to be cumulated

		}

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		finalReading = sensorsSummation/weightsSummation; // calculate the final reading which is the weighted mean

		//------------------------------------------------------------------------------  
		if(toGetCumulated.isEmpty()) // if no available sensors to read 
		{
			nullifyAll(pos); // nullify all the current readings 
			return PMThreshold<=finalReading; 
		}
		//------------------------------------------------------------------------------
		SubjectiveOpinion finalDecision = SubjectiveOpinion.fuse(toGetCumulated); // cumulate all the available opinions 

		updateReputations(date,pos,finalReading); // update the reputations current nodes
		nullifyAll(pos); // reset all values

		if(--timeToEndAttack == 0)
		{
			attack=false;
		}

		if(countHours>50) // the attack started start recording the results
		{ 
			writeFinalDecisionToCsvFile(date, pos, finalReading, finalDecision); // record the results of the current time step

		}

		countHours++; // increment the current simulation length as it lasted for one more hour

		return PMThreshold<=finalReading;

	}

	private static void nullifyAll(int pos)
	{
		for(Sensor s: sensorsList.values()) 
		{
			s.getSensorOpinion()[pos]=null;
			s.setBatteryLevel(0.0);
		}

	}

	private static void updateReputations(String date, int pos, double finalReading) 
	{
		HashMap<Integer, SubjectiveOpinion> updatedReputations= new HashMap<Integer,SubjectiveOpinion>();

		if(sensorsList.size()==2)
		{
			return;
		}

		standrizeReadings(pos);

		for (Sensor updatedSensor : sensorsList.values())
		{
			if(updatedSensor.getSensorOpinion()[pos] == null)
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

				if(s.getSensorOpinion()[pos]== null)
					continue;

				if(reputationList.get(s.getId()).getBelief()<0.1 && reputationList.get(s.getId()).getUncertainty()<0.5 )
					continue;
				SubjectiveOpinion serversOpinion = s.getSensorOpinion()[pos].discountBy(reputationList.get(s.getId()));
				sensorsSummation += s.getFineDustReading()[pos]*serversOpinion.getExpectation();
				sensorsSquare += (Math.pow(s.getFineDustReading()[pos],2))*serversOpinion.getExpectation();
				weightsSummation += serversOpinion.getExpectation();

				if(firstOpinion == null)
					firstOpinion = serversOpinion;
				else
					toGetCumulated.add(serversOpinion);
			}

			// Create cumulation result and cumulative deviation without the sensor to be added, *reading sent before updating the reputations		
			cumuliativeResult = sensorsSummation/weightsSummation;
			double meanOfSquaredValues  = sensorsSquare/weightsSummation;
			double readingsDeviation = Math.sqrt(meanOfSquaredValues - (Math.pow(cumuliativeResult, 2)));
			double incTrustMlutiplier = 1.0;
			double ratio = readingsDeviation/cumuliativeResult;
			double multiplier = 2.0*(1-ratio);
			if(multiplier<0.5)
				multiplier=0.5;
			if(first)
				multiplier =1.5;
			double multipliedreadingsDeviation =  multiplier*readingsDeviation;
			if(firstOpinion==null)
				return;
			if(toGetCumulated.isEmpty())
				return;
			//SubjectiveOpinion cumulativeDecision = firstOpinion.fuse(toGetCumulated);

			double readingUnaccruacy = updatedSensor.getFineDustReading()[pos]*(1-updatedSensor.getSensorOpinion()[pos].getExpectation());		
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
					if(reading>cumuliativeResult-multipliedreadingsDeviation)
					{
						if(!flag || (flag && decisionWieght<reading - (cumuliativeResult-multipliedreadingsDeviation)))
						{
							decisionWieght = reading - (cumuliativeResult-multipliedreadingsDeviation);
							flag = true;
						}
					}

					else

						if(decisionWieght == -1.0 || (!flag && decisionWieght>(
								cumuliativeResult-multipliedreadingsDeviation) - reading))
							decisionWieght = (cumuliativeResult-multipliedreadingsDeviation) - reading;
				}
				else 
				{
					if(reading<cumuliativeResult+multipliedreadingsDeviation)
					{
						if(!flag || (flag && decisionWieght<(cumuliativeResult+multipliedreadingsDeviation) - reading))
						{
							decisionWieght = (cumuliativeResult+multipliedreadingsDeviation) - reading;
							flag = true;
						}
					}

					else

						if(decisionWieght == -1.0 || (!flag && decisionWieght>reading - 
								(cumuliativeResult+multipliedreadingsDeviation)))
						{
							decisionWieght = reading - (cumuliativeResult+multipliedreadingsDeviation) ;
						}
				}
			}

			if(flag)
			{
				evidenceFor.put(updatedSensor.getId(), evidenceFor.get(updatedSensor.getId())*decayFactor+decisionWieght*incTrustMlutiplier);
				evidenceAgainst.put(updatedSensor.getId(), evidenceAgainst.get(updatedSensor.getId())*decayFactor+0);

			}
			else
			{
				evidenceAgainst.put(updatedSensor.getId(), evidenceAgainst.get(updatedSensor.getId())*decayFactor+decisionWieght);
				evidenceFor.put(updatedSensor.getId(), evidenceFor.get(updatedSensor.getId())*decayFactor+0);

			}
			double belief = evidenceFor.get(updatedSensor.getId())/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double disbelief = evidenceAgainst.get(updatedSensor.getId())/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double uncertainity = 2/(evidenceFor.get(updatedSensor.getId())
					+evidenceAgainst.get(updatedSensor.getId())+2);
			double atomicity = reputationList.get(updatedSensor.getId()).getAtomicity();
			SubjectiveOpinion updatedReputation = new SubjectiveOpinion(belief,disbelief,uncertainity,atomicity);
			writeTrustToCsvFile(date, pos, updatedSensor.getId(), updatedSensor.getFineDustReading()[pos],
					reputationList.get(updatedSensor.getId()), finalReading);
			updatedReputations.put(updatedSensor.getId(), updatedReputation);
		}
		for (int sensor : updatedReputations.keySet())
		{
			reputationList.put(sensor, updatedReputations.get(sensor));			
		}
	}

	public static void SimulateDay(String date)
	{
		//System.out.println(date);
		for(int i=0;i<24;i++)
		{
			setAlarm(i,date); // loop to run the simulation for every hour of the day
		}

	}

	// --------------------------------------------------------- Under Development ------------------------------------------------------------------

	private static void standrizeReadings(int pos) 
	{
		double cumuliativeResult = 0.0;
		double sensorsSummation = 0.0;
		double sensorsSquare = 0.0;
		double weightsSummation = 0.0;
		for(Sensor s: sensorsList.values())
		{
			if(s.getSensorOpinion()[pos]== null)
				continue;

			if(reputationList.get(s.getId()).getBelief()<0.1 && reputationList.get(s.getId()).getUncertainty()<0.5 )
				continue;

		}

	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------

	// --------------------------------------------------------- Getters, Setters and printing methods -----------------------------------------------------------------------

	public static String getSimDate() {
		return SimDate;
	}

	public static void setSimDate(String SimDate) {
		SensorsManager.SimDate = SimDate;
	}

	public static boolean isFirst()
	{
		return first;
	}

	public static int getPeriodLength() {
		return periodLength;
	}

	public static void setPeriodLength(int periodLength) {
		SensorsManager.periodLength = periodLength;
	}

	public static int getFrequencyOfAttack() {
		return frequencyOfAttack;
	}

	public static void setFrequencyOfAttack(int frequencyOfAttack) {
		SensorsManager.frequencyOfAttack = frequencyOfAttack;
	}

	public static void setFirst(boolean first) {
		SensorsManager.first = first;
	}

	public static String getDirectory() {
		return directory;
	}

	public static void setDirectory(String directory) {
		SensorsManager.directory = directory;
	}

	public static double getDecayFactor() {
		return decayFactor;
	}

	public static void setDecayFactor(double decayFactor) {
		SensorsManager.decayFactor = decayFactor;
	}

	private static void printReputations() 
	{
		for (SubjectiveOpinion so : reputationList.values()) 
		{
			System.out.print(so.getBelief()+" ");
		}

	}

	public static double getAddedValue() {
		return addedValue;
	}

	public static void setAddedValue(int addedValue) {
		SensorsManager.addedValue = addedValue;
	}

	public static ArrayList<Integer> getParticipation() {
		return Participation;
	}

	public static HashMap<Integer, Sensor> getSensorsList() {return sensorsList;}
	// ---------------------------------------------------------------------------------------------------------------------------------------------

	//------------------------------------------------------------ Writing to CSV Files -------------------------------------------------------------------
	private static void writeFinalDecisionToCsvFile(String date, int pos, double finalReading, SubjectiveOpinion opinion)
	{
		FileWriter fileWriter = null;

		try{
			File file = new File(directory);
			if (!file.exists()) 
			{
				file.createNewFile();
				fileWriter = new FileWriter(file.getAbsoluteFile(), true);
				//Write the CSV file header
				fileWriter.append(FILE_HEADER_2.toString());
			}

			else{ fileWriter = new FileWriter(file.getAbsoluteFile(), true);}

			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file
			fileWriter.append(date.substring(0,4)+date.substring(5,7)+date.substring(8));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(pos));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+finalReading);
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getBelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getDisbelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getUncertainty());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getAtomicity());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getExpectation());

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}

	}




	private static void writeTrustToCsvFile(String date, int pos, int id, double reading, SubjectiveOpinion opinion, double finalReading ) {

		FileWriter fileWriter = null;

		try {
			File file = null;
			if(id!=1098)
				file= new File("/home/nabegh/Bachelor/Results/Trust/"+id+".csv");
			else
				file = new File("/home/nabegh/Bachelor/Results/Trust/"+id+"attack.csv");

			if (!file.exists()) 
			{
				file.createNewFile();
				fileWriter = new FileWriter(file.getAbsoluteFile(), true);
				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
			}
			else{ fileWriter = new FileWriter(file.getAbsoluteFile(), true);}



			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file
			fileWriter.append(date.substring(0,4)+date.substring(5,7)+date.substring(8));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(pos));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(id));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+reading);
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getBelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getDisbelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getUncertainty());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getAtomicity());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getExpectation());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+finalReading);





			//System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}

	private static void writeTrustToCsvFileD(String date, int pos, int id, double reading, SubjectiveOpinion opinion, double finalReading ) {

		FileWriter fileWriter = null;

		try {
			File file = new File("/home/nabegh/Bachelor/Results/Trust/"+date+".csv");

			if (!file.exists()) 
			{
				file.createNewFile();
				fileWriter = new FileWriter(file.getAbsoluteFile(), true);
				//Write the CSV file header
				fileWriter.append(FILE_HEADER.toString());
			}
			else{ fileWriter = new FileWriter(file.getAbsoluteFile(), true);}



			//Add a new line separator after the header
			fileWriter.append(NEW_LINE_SEPARATOR);

			//Write a new student object list to the CSV file
			fileWriter.append(date.substring(0,4)+date.substring(5,7)+date.substring(8));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(pos));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(String.valueOf(id));
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+reading);
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getBelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getDisbelief());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getUncertainty());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getAtomicity());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+opinion.getExpectation());
			fileWriter.append(COMMA_DELIMITER);
			fileWriter.append(""+finalReading);





			//System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing fileWriter !!!");
				e.printStackTrace();
			}

		}
	}


}
