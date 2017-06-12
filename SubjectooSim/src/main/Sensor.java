package main;

import java.util.Date;
import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class Sensor 
{
	private int id;
	private double batteryLevel;
	//private double fineDustReadings;
	private SubjectiveOpinion sensorOpinion;
	//private Date lastReadingStamp;
	private String lastReadingStamp;
	private double xCoordinate;
	private double yCoordinate;
	private static double alpha = 0.125;
	private boolean isActive;
	private double [] fineDustReadings;


	public Sensor()
	{

	}

	public Sensor(int id, double xCoordinate, double yCoordinate)
	{
		this.id = id;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		fineDustReadings = new double[24];
		//isActive = false;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setSensorOpinion(SubjectiveOpinion sensorOpinion) {
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

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getId() {
		return id;
	}

	public double getBatteryLevel() {
		return batteryLevel;
	}

	public double[] getFineDustReading() {
		return fineDustReadings;
	}

	public void setFineDustReading(double[] fineDustReadings) {
		this.fineDustReadings = fineDustReadings;
	}

	public SubjectiveOpinion getSensorOpinion() {
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

	public boolean isActive()
	{
		return isActive;
	}

	public void recieveReading (double fineDustReadings, int pos)
	{
		double batteryLevel = 100.0;
		double beliefComponent = (batteryLevel/100.0)-(100.0*alpha/batteryLevel);
		double disbeliefComponent = 1-beliefComponent; 
		SubjectiveOpinion selfOpinion = new SubjectiveOpinion(beliefComponent,disbeliefComponent,0);
		SubjectiveOpinion reading = new SubjectiveOpinion(1,0,0);
		if (sensorOpinion == null)
		{
			sensorOpinion = reading.discountBy(selfOpinion);
			this.fineDustReadings[pos] = fineDustReadings;
		}
		else
		{
			reading = reading.discountBy(selfOpinion);
			this.fineDustReadings[pos] = (this.fineDustReadings[pos]*sensorOpinion.getExpectation()+
					fineDustReadings*reading.getExpectation())/(sensorOpinion.getExpectation()+reading.getExpectation());
			sensorOpinion = sensorOpinion.fuse(reading);			
		}		
		//lastReadingStamp = timeStamp;
		//isActive = true;
	}

}
