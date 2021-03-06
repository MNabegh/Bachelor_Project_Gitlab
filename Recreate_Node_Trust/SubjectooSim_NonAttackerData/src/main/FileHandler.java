package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler extends Thread
{
	private File toBeRead ;
	private BufferedReader br;

	public FileHandler (File TBR)
	{
		toBeRead = TBR;
	}

	public void run()
	{
		
		try {
			br = new BufferedReader(new FileReader(toBeRead));
			String line = br.readLine(); // the first line contains the titles of each columns we do not need it
			line = br.readLine();  // read the second line which is the first line of important data
			String [] dataEntry = line.split(";"); 
			if(toBeRead.getName().startsWith("download.py")) // this file should not be read as it contains no data but it exists in the same directory
				return;
			if(SensorsManager.getSensorsList().get(Integer.parseInt(dataEntry[0]))==null) // get the sensor ID and check if it's registered or is it the first time to have an input file
				SensorsManager.registerSensor(Integer.parseInt(dataEntry[0]), Double.parseDouble(dataEntry[3]), Double.parseDouble(dataEntry[4])); // if not registered perform the registration operation 
			

			do 
			{
				dataEntry = line.split(";"); // except for the first line every new line will come from the loop condition and have not been split before
				SensorsManager.recieveReading(Integer.parseInt(dataEntry[0]), Double.parseDouble(dataEntry[9]), Integer.parseInt(dataEntry[5].substring(11, 13)),Double.parseDouble(dataEntry[3]),Double.parseDouble(dataEntry[4])); 
				// each line contatin a reading according to the index at the end of this file we can see what each position in the array is expected to present
				

			} while ((line= br.readLine())!=null); // looping on all of the lines in the file
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println(toBeRead.getName());
			e.printStackTrace();
		} catch (Exception e) {
			//System.out.println(toBeRead.getName());
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