package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler extends Thread
{
	private File toBeRead ;

	public FileHandler (File TBR)
	{
		toBeRead = TBR;
	}

	public void run()
	{
		Sensor s = null ;
		try {
			BufferedReader br = new BufferedReader(new FileReader(toBeRead));
			String line = br.readLine();
			line = br.readLine();
			String [] dataEntry = line.split(";");
			if(SensorsManager.getSensorsList().get(Integer.parseInt(dataEntry[0]))==null)
			{
				SensorsManager.registerSensor(Integer.parseInt(dataEntry[0]), Double.parseDouble(dataEntry[3]), Double.parseDouble(dataEntry[4]));
			}
			System.out.println(dataEntry[5].substring(11, 13));

			do 
			{
												
			} while ((line= br.readLine())!=null);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


// 0- sensor id
// 1- sensor type
// 2- sensor location
// 3- latitude
// 4- longitude 
// 5- Time Stamp: substring(11,13) -> hour
// 6- PM10 Reading
// 7,8- Empty
// 9- PM2.5 Reading