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
		double  d = 0.9;//Double.parseDouble(args[1]);
		boolean first = false; //Boolean.parseBoolean(args[0]);
		SensorsManager.setDecayFactor(d);
		SensorsManager.setFirst(first);
		SensorsManager.setEndSim(24*10+5+1+50);
		SensorsManager.setSimDate("2017-06-22}}");
		if(!first)
			run("/Decay_"+d);
		if(first)
			run("/Decay_"+d+"/"+"/First");
	}

	public static void run(String first)
	{

		File folder1 = new File("/home/nabegh/Bachelor/Results/Trust");
		File[] files = folder1.listFiles();
		for(File f: files)
			f.delete();

		File directory = new File("/home/nabegh/Bachelor/Results/FinalDecision"+first);
		if(!directory.exists())
			directory.mkdirs();						
		String dir = "/home/nabegh/Bachelor/Results/FinalDecision"+first+"/FinalDecision.csv";
		SensorsManager.setDirectory(dir);
		File file = new File(dir);
		if(file.exists())
			file.delete();

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
