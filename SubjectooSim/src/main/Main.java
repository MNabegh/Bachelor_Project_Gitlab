package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

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
		
		System.out.println(listOfFiles[0].getName().substring(0, 10));
		
		BufferedReader br = null;		
		// jungingen 17:27 PM10 = 2 PM2.5 = 1
		

		for (int i = 0; i < 0; i++) 
		{
			
			String date;
			
			do
			{
				date = listOfFiles[i].getName().substring(0, 10);
								
				
				i++;		
			}while(i<listOfFiles.length && listOfFiles[i].getName().substring(0,10).equals(date) );
		}		
	}
	
	

	


}
