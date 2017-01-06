package lab13_scanner_files;
import SUPPORT.*;

import java.io.*;
public class Box 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			String[] file = SU.returnFileContentAsArray("Box.txt","[\\r\\n]+");
					for(String s: file)
					{		
						int i = 1;
						for(int count=1;count<=Integer.parseInt(s.split(" ")[1]);count++)
						{
							for(i =1;i<=Integer.parseInt(s.split(" ")[1]);i++)
							{
								System.out.print(s.split(" ")[0]);
							}
							System.out.print("\n");
						}
						
						System.out.print("\n");
					}
				}

		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
}
