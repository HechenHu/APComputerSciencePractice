package lab13_scanner_files;
import SUPPORT.*;

import java.io.*;
public class TheLine 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			int max = 0;
			String[] file = SU.returnFileContentAsArray("TheLine.txt","[\\r\\n]+");
			for(String s: file)
			{		
				max = 0;
				for(String ind : s.split(" "))
				{
					max = Integer.parseInt(ind)>max?Integer.parseInt(ind):max;
					System.out.print(ind+" ");
				}
				System.out.print("-  Largest == "+max+"\n");
			}
		}
		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
	
	
}
