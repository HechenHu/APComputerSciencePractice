package lab09_while_dowhile;

import java.util.*;

public class Divisors 
{
	public void printResult(int num)
	{
		System.out.println(num+" has Divisors "+ReturnResult(num)+"\n");
	}
	public ArrayList<Integer> ReturnResult(int num)
	{
		ArrayList<Integer> divisor = new ArrayList<Integer>();
		int i;
		int indexCount=0;
		if(num%2==0)
		{
			for(i=1;i<=Math.ceil(Math.sqrt((double)num));i++)
			{
				if(num%i==0&&!divisor.contains(i))
				{
					if(i*i==num)
					{
						divisor.add(indexCount,i);
						indexCount++;
					}
					else
					{
						divisor.add(indexCount,i);
						divisor.add(indexCount+1,num/i);
						indexCount++;
					}
				}
			}
		}
		else if(num%3==0)
		{
			for(i=1;i<=Math.ceil(Math.sqrt((double)num));i++)
			{
				if(num%i==0&&!divisor.contains(i))
				{
					if(i*i==num)
					{
						divisor.add(indexCount,i);
						indexCount++;
					}
					else
					{
						divisor.add(indexCount,i);
						divisor.add(indexCount+1,num/i);
						indexCount++;
					}
				}
			}
		}
		else if(num%5==0)
		{
			for(i=1;i<=Math.ceil(Math.sqrt((double)num));i++)
			{
				if(num%i==0&&!divisor.contains(i))
				{
					if(i*i==num)
					{
						divisor.add(indexCount,i);
						indexCount++;
					}
					else
					{
						divisor.add(indexCount,i);
						divisor.add(indexCount+1,num/i);
						indexCount++;
					}
				}
			}
		}
		else if(num%7==0)
		{
			for(i=1;i<=Math.ceil(Math.sqrt((double)num));i++)
			{
				if(num%i==0&&!divisor.contains(i))
				{
					if(i*i==num)
					{
						divisor.add(indexCount,i);
						indexCount++;
					}
					else
					{
						divisor.add(indexCount,i);
						divisor.add(indexCount+1,num/i);
						indexCount++;
					}
				}
			}
		}
		
		divisor.remove(divisor.size()-1);
		return divisor;
	}
}
