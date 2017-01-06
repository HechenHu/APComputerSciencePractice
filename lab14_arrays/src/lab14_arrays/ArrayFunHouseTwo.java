package lab14_arrays;
import java.util.*;

import SUPPORT.*;

import java.io.*;
public class ArrayFunHouseTwo 
{
	Support SU = new Support();
	ArrayList<Number> test = new ArrayList<Number>();
	
	public void IsGoingUp()
	{
		try
		{
		String[] input = SU.returnFileContentAsArray("ArrayFunHouseTwo.txt","[\\r\\n]+");
		for(String s:input)
		{
			int i =0;
			String[] NumberArray = s.replaceAll("\\[|\\]", "").split(",");
			ArrayList<Number> InputArrayList= new ArrayList<Number>();
			for(String ind :NumberArray)
				{
					InputArrayList.add(Integer.parseInt(ind));
				}
			System.out.println(InputArrayList);
			for(i=0;i<InputArrayList.size()-1;i++)
			{
				if(InputArrayList.get(i).intValue()>InputArrayList.get(i+1).intValue())
				{
					System.out.println(" is Going Up ? False");
					break;
				}
				else if(i==InputArrayList.size()-2)
					System.out.println(" is Going Up ? True");
			}
				
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
	}
	
	public void IsGoingDown()
	{
		try
		{
		String[] input = SU.returnFileContentAsArray("ArrayFunHouseTwo.txt","[\\r\\n]+");
		for(String s:input)
		{
			int i =0;
			String[] NumberArray = s.replaceAll("\\[|\\]", "").split(",");
			ArrayList<Number> InputArrayList= new ArrayList<Number>();
			for(String ind :NumberArray)
				{
					InputArrayList.add(Integer.parseInt(ind));
				}
			System.out.println(InputArrayList);
			for(i=0;i<InputArrayList.size()-1;i++)
			{
				if(InputArrayList.get(i).intValue()<InputArrayList.get(i+1).intValue())
				{
					System.out.println(" is Going Down ? False");
					break;
				}
				else if(i==InputArrayList.size()-2)
					System.out.println(" is Going Down ? True");
			}
				
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
	}
	
	public void PrintNumberGreaterthan(int num)
	{
		try
		{
		String[] input = SU.returnFileContentAsArray("ArrayFunHouseTwo.txt","[\\r\\n]+");
		for(String s:input)
		{
			int i =0;
			System.out.println(s);
			String[] NumberArray = s.replaceAll("\\[|\\]", "").split(",");
			ArrayList<Number> InputArrayList= new ArrayList<Number>();
			for(String ind :NumberArray)
				{
					if(Integer.parseInt(ind)>num)
					{
						InputArrayList.add(Integer.parseInt(ind));
					}
					
				}
			System.out.println(InputArrayList+"\n");
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
	}
}
