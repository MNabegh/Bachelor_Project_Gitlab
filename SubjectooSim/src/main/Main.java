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
		
		BufferedReader br = null;		
		// jungingen 17:27 PM10 = 2 PM2.5 = 1

		for (int i = 0; i < 1; i++) 
		{
			try {
				br = new BufferedReader(new FileReader(listOfFiles[i]));
				System.out.println(listOfFiles[i].getName());
				System.out.println(br.readLine());
				String line  = br.readLine();
				System.out.println(line);
				
				for(String x:line.split(";"))
					System.out.println(x);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}						
		}		
	}
	
	

	


}
