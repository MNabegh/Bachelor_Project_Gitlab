package main;

import java.io.File;

public class FileHandler extends Thread
{
	private File toBeRead ;
	
	public FileHandler (File TBR)
	{
		toBeRead = TBR;
	}
	
	public void run()
	{
		
	}
}
