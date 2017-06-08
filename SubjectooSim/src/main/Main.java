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
		File folder = new File("/home/nabegh/Bachelor/FineDustMeasurementsNew");
		File[] listOfFiles = folder.listFiles();
		Arrays.sort(listOfFiles, new Comparator<File>() 
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
			do
			{
				date = listOfFiles[i].getName().substring(0, 10);
				FileHandler fh = new FileHandler(listOfFiles[i]);
				executor.submit(fh);				
				i++;		
			}while(i<listOfFiles.length && listOfFiles[i].getName().substring(0,10).equals(date) );
			try {
				executor.awaitTermination(1, TimeUnit.DAYS);
				SensorsManager.SimulateDay();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
	}
	
	

	


}
