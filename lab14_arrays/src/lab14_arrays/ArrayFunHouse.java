package lab14_arrays;
import SUPPORT.*;
import java.util.*;
import java.io.*;
public class ArrayFunHouse 
{
	Support SU = new Support();
	ArrayList<Number> test = new ArrayList<Number>();
	public void SumUp(int LowerBound,int UpperBound)
	{
		try
		{
		String[] input = SU.returnFileContentAsArray("ArrayFunHouseOne.txt","[\\r\\n]+");
		for(String s:input)
		{
			int i =0;
			int sum = 0;
			String[] NumberArray = s.replaceAll("\\[|\\]", "").split(", ");
			ArrayList<Number> InputArrayList= new ArrayList<Number>();
			for(String ind :NumberArray)
			{
				InputArrayList.add(Integer.parseInt(ind));
			}
			System.out.println(InputArrayList);
			if(UpperBound<=InputArrayList.size()-1&&LowerBound>=0)
			{
				for(i=LowerBound+1;i<=UpperBound;i++)
				{
					sum+= InputArrayList.get(i).intValue();
					System.out.println(InputArrayList.get(i).intValue());
				}
			}

			System.out.println("The Sum of spots "+LowerBound+"-"+UpperBound+" == "+sum);
				
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
	}
	
	public void RemoveRedundant(int num)
	{
		try
		{
		String[] input = SU.returnFileContentAsArray("ArrayFunHouseOne.txt","[\\r\\n]+");
		ArrayList<Number> InputArrayList= new ArrayList<Number>();
		for(String s:input)
		{
			String[] Number = s.replaceAll("\\[|\\]", "").split(", ");
			for(String ind:Number)
			{
				InputArrayList.add(Integer.parseInt(ind));
			}
			System.out.print("New Array With All "+num+"s removed ::  [");
			for(Number n:SU.removeRedundant(InputArrayList, num))
			{
				System.out.print(n+", ");
			}
			System.out.println("]"+"\n");
	
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
		
	}
	public void FindRepeatedNumber(int num)
	{
		try
		{
			int count = 0;
			String[] input = SU.returnFileContentAsArray("ArrayFunHouseOne.txt","[\\r\\n]+");
			for(String s:input)
			{
				count=0;
				String[] Number = s.replaceAll("\\[|\\]", "").split(", ");
				for(String ind:Number)
				{
					count+=Integer.parseInt(ind)==num?1:0;
				}
				System.out.println("# of "+num+"s :: "+count);
			
			
	
		}
		
		}
		catch(IOException IOex)
		{
			System.out.println("Unable to Read File Content!!");
		}
		
	}
	
}
