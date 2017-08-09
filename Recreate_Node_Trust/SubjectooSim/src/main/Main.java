package main;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main 
{

	public static void main(String[] args)
	{
		double  d = 0.6;//Double.parseDouble(args[1]);
		int  add = 200;//Integer.parseInt(args[2]);
		int j = 4;//Integer.parseInt(args[4]);
		boolean first = false;//Boolean.parseBoolean(args[0]);
		SensorsManager.setDecayFactor(d);
		SensorsManager.setAddedValue(add);
		SensorsManager.setFirst(first);
		SensorsManager.setSimDate("2017-06-21");//args[3]);
		String type = "/Decay_"+d;
		if(first)
			type+="/First";
		if(add==-1)
			type+="/Random-Constant";
		else
			type+="/Clever-Constant_+"+add;
		//System.out.println(type);
		run(type, j);				


	}

	public static void run(String first,int j)
	{
		File directory = new File("/home/nabegh/Bachelor/Results/FinalDecision/Track/"+first);
		if(!directory.exists())
		{
			directory.mkdirs();	
		}
		String dir = directory+"/FinalDecision"+j+"_11.csv";
		System.out.println(dir);
		SensorsManager.setDirectory(dir);
		
		SensorsManager.getParticipation().add(1098);
		if(j>1)
			SensorsManager.getParticipation().add(3323);
		if(j>2)
			SensorsManager.getParticipation().add(2394);
		if(j>3)
			SensorsManager.getParticipation().add(2630);
		if(j>4)
			SensorsManager.getParticipation().add(1178);
		if(j>5)
			SensorsManager.getParticipation().add(481);

		File folder = new File("/home/nabegh/Bachelor/FineDustMeasurementsNew"); // directory of the fine dust measurements
		File[] listOfFiles = folder.listFiles(); // list of files in the directory
		Arrays.sort(listOfFiles, new Comparator<File>()  // sorting the files by date
				{

			public int compare(File o1, File o2)
			{
				return o1.getName().compareTo(o2.getName());
			}
				});

		int i=0;
		while(i<listOfFiles.length) 
		{			
			String date;
			ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()+1); // create a thread pool
			do
			{
				date = listOfFiles[i].getName().substring(0, 10);                                    // take the date which is the first 9 characters of the file's name
				FileHandler fh = new FileHandler(listOfFiles[i]);                                   // create a new filehandler thread
				executor.submit(fh); // start the thread
				i++;                                                                                // go to the next file
			}while(i<listOfFiles.length && listOfFiles[i].getName().substring(0,10).equals(date) ); // continue if there more files and the next one has the same date
			try 
			{
				executor.shutdown();                // stop accepting tasks
				executor.awaitTermination(1, TimeUnit.DAYS); // wait until all the tasks are finished to continue
				SensorsManager.SimulateDay(date); // start simulating the day
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}

		}

	}




}