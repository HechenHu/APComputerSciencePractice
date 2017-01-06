package lab13_scanner_files;
import SUPPORT.*;

import java.io.*;
public class Prime 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			String[] file = SU.returnFileContentAsArray("Prime.txt","[\\r\\n]+");
					for(String s: file)
					{		
						System.out.println(s+(SU.isPrime(Integer.parseInt(s))?" IS PRIME ":" IS NOT PRIME"));
					}
				}

		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
}
