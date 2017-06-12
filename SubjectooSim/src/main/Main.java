package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main 
{
	
	public static void main(String[] args)
	{
		File folder = new File("/home/nabegh/Bachelor/FineDustMeasurementsNew"); // directory of the fine dust measurements
		File[] listOfFiles = folder.listFiles(); // list of files in the directory
		Arrays.sort(listOfFiles, new Comparator<File>()  // sorting the files by date
		{
           
            public int compare(File o1, File o2)
            {
            	return o1.getName().compareTo(o2.getName());
            }
		});
		
		/*FileHandler fh = new FileHandler(listOfFiles[0]);
		fh.start();
		try {
			fh.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SensorsManager.printSensorList();*/
		
		BufferedReader br = null;		
		// jungingen 17:27 PM10 = 2 PM2.5 = 1
		
		int i=0;
		while(i<listOfFiles.length) 
		{			
			String date;
			ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()+1); 
			/*if(!(listOfFiles[i].getName().substring(0, 10).equals("2017-01-26")))
			{
				i++;
				continue;
			}*/
			do
			{
				date = listOfFiles[i].getName().substring(0, 10); // take the date which is the first 9 characters of the file's name
				//System.out.println(listOfFiles[i].getName().substring(0,10));
				FileHandler fh = new FileHandler(listOfFiles[i]); // create a new filehandler thread
				executor.submit(fh); // start the thread
				i++; // go to the next file
				//System.out.println(i<listOfFiles.length && listOfFiles[i].getName().substring(0,10).equals(date) );
			}while(i<listOfFiles.length && listOfFiles[i].getName().substring(0,10).equals(date) ); // continue if there more files and the next one has the same date
			try {
				executor.shutdown(); // stop accepting tasks
				executor.awaitTermination(1, TimeUnit.DAYS); // wait until all the tasks are finished to continue
				//System.out.println(date);
				SensorsManager.SimulateDay(date); // start simulating the day
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}
	
	

	


}
