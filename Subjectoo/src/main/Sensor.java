package main;

import java.util.Date;
import no.uio.subjective_logic.opinion.SubjectiveOpinion;

public class Sensor 
{
	private int id;
	private double batteryLevel;
	private double fineDustReading;
	private SubjectiveOpinion sensorOpinion;
	private Date lastReading;
	private double xCoordinate;
	private double yCoordinate;
	private static double alpha = 0.75;
	
	
	public Sensor()
	{
		
	}
	
	public Sensor(int id, double xCoordinate, double yCoordinate)
	{
		this.id = id;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
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

	public void setLastReading(Date lastReading) {
		this.lastReading = lastReading;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
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

	public Date getLastReading() {
		return lastReading;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}
	
	public void recieveReading (double batteryLevel, double fineDustReading)
	{
		double beliefComponent = (batteryLevel/100)-(100*alpha/batteryLevel);
		double disbeliefComponent = 1-beliefComponent; 
		SubjectiveOpinion newComponent = new SubjectiveOpinion(beliefComponent,disbeliefComponent,0);
		
	}
}