package lab13_scanner_files;
import SUPPORT.*;

import java.io.*;
public class Average 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			int sum = 0;
			int min = 0;
			String[] file = SU.returnFileContentAsArray("Average.txt","[\\r\\n]+");
					for(String s: file)
					{		
						sum = 0;
						min = Integer.parseInt(s.split(" ")[0]);
						for(String ind:s.split(" "))
						{
							min = Integer.parseInt(ind)<min?Integer.parseInt(ind):min;
						}
						for(String ind:s.split(" "))
						{
							sum += Integer.parseInt(ind);
							System.out.print(ind+" ");
						}
						sum-=min;
						System.out.println("\n"+"Average == "+(String.format("%.2f", (float)sum/((s.split(" ").length)-1)))+"\n");
					}
				}

		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
}
