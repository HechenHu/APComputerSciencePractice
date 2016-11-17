package set1_forloop_labs;

import java.util.ArrayList;

public class GCD 
{
	public ArrayList<Integer> findCommonDivisor(int num)
	{
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		int i = 0;
		for(i=1;i<=num;i++)
		{
			if(num%(i)==0)
			{
				divisor.add(i);
			}
		}
		return divisor;
	}
	public int compareTwoDivisors(ArrayList<Integer> First,ArrayList<Integer> Second)
	{
		int i =0;
		int greatestDivisor = -1;
		for(i=0;i<=First.size()-1&&i<=Second.size()-1;i++)
		{
			if(Second.indexOf(First.get(i))!=-1)
			{
				greatestDivisor = First.get(i);
				continue;
			}
		}
		return greatestDivisor;
	}
	public void printResult(int num1,int num2)
	{
		int greatestDivisor = compareTwoDivisors(findCommonDivisor(num1),findCommonDivisor(num2));
		System.out.println("First Common Divisor Array List"+findCommonDivisor(num1));
		System.out.println("Second Common Divisor Array List"+findCommonDivisor(num2));
		if(greatestDivisor!=-1)
			System.out.println("The Greatest Common Divisor of "+num1+" "+num2+" is "+greatestDivisor+"\n");
		else
			System.out.println("No Result");
	}
}
