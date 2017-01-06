package lab13_scanner_files;
import SUPPORT.*;
import java.io.*;
public class OddOrEven 
{
	Support SU = new Support();
	public void printResult()
	{
		try
		{
			String[] file = SU.returnFileContentAsArray("OddOrEven.txt","[\\r\\n]+");
			for(String s: file)
			{		
				System.out.println(s+(SU.isOdd(Integer.parseInt(s))?" is Odd":" is Even")+"\n");
			}
		}
		catch(IOException IOex)
		{
			System.out.println("File Donot Exist OR Not Readible");
		}
	}
}
