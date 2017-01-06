package lab15_sort_search_24;
import java.util.*;
import SUPPORT.*;
public class NumberShifter 
{
	public static void main(String args[])
	{
		Support SU = new Support();
		ArrayList<Integer> Input = new ArrayList<Integer>();
		ArrayList<Integer> Output = new ArrayList<Integer>();
		for(int i = 0;i<SU.ReturnRandom(10,20);i++)
		{
			Input.add(SU.ReturnRandom(10));
		}
		for(int i:Input)
		{
			if(i==7)
			{
				Output.add(i);
			}
		}
		for(int i:Input)
		{
			if(i!=7)
			{
				Output.add(i);
			}
		}
		System.out.println(Input);
		System.out.println(Output);
	}
}
