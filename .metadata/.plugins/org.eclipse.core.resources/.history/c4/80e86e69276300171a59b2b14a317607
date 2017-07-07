package main;


import java.util.HashMap;
import java.util.Random;

public class AttackScenario 
{
	private static HashMap<Integer,AttackerType> attackers = new HashMap<Integer,AttackerType>() ;
	private static HashMap<String,Integer> attackSchedule = new HashMap<String, Integer>(); 
	private static int constInc;
	private static int constDec;
	
	public static void setAttackers (HashMap<Integer, AttackerType> attackers)
	{
		AttackScenario.attackers = attackers ;		
	}
	
	public static boolean checkForAttack (String date, int pos)
	{
		if(attackers.isEmpty())
			return false;
		if(attackSchedule.isEmpty())
			return false;
		
		String check = date+pos;
		Integer id;
		if((id= attackSchedule.get(check))==null)
			return false;
		
		AttackerType perform = attackers.get(id) ;
		if(perform.equals(AttackerType.RANDOM))
		{
			implementRandom(SensorsManager.getSensorsList().get(id),pos);
			return true;
		}
		
		if(perform.equals(AttackerType.CONSTANTINC))
		{
			implementConstInc(SensorsManager.getSensorsList().get(id),pos);
			return true;
		}
		
		implementConstDec(SensorsManager.getSensorsList().get(id),pos);
		
		return true;
		
	}
	
	

	private static void implementConstDec(Sensor sensor,int pos)
	{
		sensor.getFineDustReading() [pos] = sensor.getFineDustReading()[pos]-constDec;
		
	}

	private static void implementConstInc(Sensor sensor, int pos) 
	{
		sensor.getFineDustReading() [pos] = sensor.getFineDustReading()[pos]+constInc;
		
	}

	private static void implementRandom(Sensor sensor, int pos)
	{
		Random r = new Random();
		sensor.getFineDustReading()[pos] = r.nextInt(100);		
	}
}
