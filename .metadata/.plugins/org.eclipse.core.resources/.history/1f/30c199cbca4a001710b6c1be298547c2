package main;

import java.util.Date;
import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class Sensor 
{
	private int id;
	private double batteryLevel;
	private double fineDustReading;
	private SubjectiveOpinion sensorOpinion;
	private Date lastReadingStamp;
	private double xCoordinate;
	private double yCoordinate;
	private static double alpha = 0.75;
	private boolean isActive;
	private double believeWeight = 0.0;
	private double disbelieveWeight = 0.0;


	public Sensor()
	{

	}

	public Sensor(int id, double xCoordinate, double yCoordinate)
	{
		this.id = id;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		isActive = false;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setBatteryLevel(double batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public void setFineDustReading(double fineDustReading) {
		this.fineDustReading = fineDustReading;
	}

	public void setSensorOpinion(SubjectiveOpinion sensorOpinion) {
		this.sensorOpinion = sensorOpinion;
	}

	public void setLastReadingStamp(Date lastReadingStamp) {
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

	public double getFineDustReading() {
		return fineDustReading;
	}

	public SubjectiveOpinion getSensorOpinion() {
		return sensorOpinion;
	}

	public Date getLastReadingStamp() {
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

	public void recieveReading (double batteryLevel, double fineDustReading)
	{
		double beliefComponent = (batteryLevel/100)-(100*alpha/batteryLevel);
		double disbeliefComponent = 1-beliefComponent; 
		SubjectiveOpinion newComponent = new SubjectiveOpinion(beliefComponent,disbeliefComponent,0);
		if (sensorOpinion == null)
		{
			sensorOpinion = newComponent;
			this.fineDustReading = fineDustReading;
		}
		else
		{
			this.fineDustReading = (this.fineDustReading*sensorOpinion.getExpectation()+fineDustReading*newComponent.getExpectation())/(sensorOpinion.getExpectation()+newComponent.getExpectation());
			sensorOpinion = sensorOpinion.fuse(newComponent);			
		}		
		lastReadingStamp = new Date();
		isActive = true;
	}
	
}
