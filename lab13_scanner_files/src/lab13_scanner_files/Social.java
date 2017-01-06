package lab13_scanner_files;
import SUPPORT.*;

import java.io.*;
public class Social 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			int sum = 0;
			String[] file = SU.returnFileContentAsArray("Social.txt","[\\r\\n]+");


					for(String s: file)
					{		
						sum = 0;
						System.out.print("SS# "+s);
						for(String ind : s.split("-"))
						{
							sum += Integer.parseInt(ind);
						}
						System.out.print(" has the sum of "+sum+"\n");
					}
				}

		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
}
