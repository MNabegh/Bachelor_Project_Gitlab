package main;

import java.util.Date;
import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class Sensor 
{
	private int id;
	private double batteryLevel;
	//private double fineDustReadings;
	//private SubjectiveOpinion sensorOpinion;
	//private Date lastReadingStamp;
	private String lastReadingStamp;
	private double xCoordinate;
	private double yCoordinate;
	private static double alpha = 0.125;
	private double [] fineDustReadings;
	private SubjectiveOpinion [] sensorOpinion;


	public Sensor()
	{

	}

	public Sensor(int id, double xCoordinate, double yCoordinate, SubjectiveOpinion[] array)
	{
		this.id = id;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		sensorOpinion = array;
		fineDustReadings = new double[24];
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setSensorOpinion(SubjectiveOpinion[] sensorOpinion) {
		this.sensorOpinion = sensorOpinion;
	}

	public void setLastReadingStamp(String lastReadingStamp) {
		this.lastReadingStamp = lastReadingStamp;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public static double getAlpha() {
		return alpha;
	}

	public static void setAlpha(double alpha) {
		Sensor.alpha = alpha;
	}

	public int getId() {
		return id;
	}

	public double getBatteryLevel() {
		return batteryLevel;
	}

	public double[] getFineDustReading() {
		if(fineDustReadings == null)
			System.out.println(id);
		return fineDustReadings;
	}

	public void setFineDustReading(double[] fineDustReadings) {
		this.fineDustReadings = fineDustReadings;
	}

	public SubjectiveOpinion[] getSensorOpinion() {
		if(sensorOpinion==null)
			System.out.println(id);
		return sensorOpinion;
	}

	public String getLastReadingStamp() {
		return lastReadingStamp;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void recieveReading (double fineDustReading, int pos)
	{
		double batteryLevel = 100.0; // we do not have battery raedings
		double beliefComponent = (batteryLevel/100.0)-(100.0*alpha/batteryLevel); // belief component of the self opinion of the reading created by the battery level
		double disbeliefComponent = 1-beliefComponent; // disbelief component of tehe self opinion of the reading created by the battery level
		SubjectiveOpinion selfOpinion = new SubjectiveOpinion(beliefComponent,disbeliefComponent,0); // creating the self opinion
		SubjectiveOpinion reading = new SubjectiveOpinion(1,0,0); // the self opinion of the sensor about itself without adding the precision lost due to battery level
		if (sensorOpinion[pos] == null) // first reading of the hour
		{
			sensorOpinion[pos] = reading.discountBy(selfOpinion); // completing the self opinion by discounting the trust lost due to battery level
			this.fineDustReadings[pos] = fineDustReading;  // saving the value
		}
		else
		{
			reading = reading.discountBy(selfOpinion); // completing the self opinion by discounting the trust lost due to battery level
			this.fineDustReadings[pos] = (this.fineDustReadings[pos]*sensorOpinion[pos].getExpectation()+
					fineDustReading*reading.getExpectation())/(sensorOpinion[pos].getExpectation()+reading.getExpectation()); // cumulation of all the readings received for a whole hour 
			sensorOpinion[pos] = sensorOpinion[pos].fuse(reading);	// cumulation of the self opinions received during the last hour 
		}		
		//lastReadingStamp = timeStamp;
		//isActive = true;
	}

}
