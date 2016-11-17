package lab09_while_dowhile;

import java.util.ArrayList;

public class Perfect 
{
	public void printResult(int num)
	{
		Divisors divisors = new Divisors();
		ArrayList<Integer> div = new ArrayList<Integer>(divisors.ReturnResult(num));
		System.out.print(num);
		divisors=null;
		int i=0;
		for(i=0;i<div.size();i++)
		{
			num-=div.get(i);
		}
		System.out.println(num==0?" is Perfect":" is Not Perfect");
		System.out.println("\n");
	}
}
