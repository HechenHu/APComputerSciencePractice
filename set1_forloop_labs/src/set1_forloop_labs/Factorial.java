package set1_forloop_labs;

public class Factorial 
{
	public long factorial(int num)
	{	
		long product =1;
		if(num!=1&&num!=0)
		{
			product = num*factorial(num-1);
		}
		else
			return 1;
		return product;
	}
	public void printResult(int num)
	{
		System.out.println("The Factorial of "+num+" is "+factorial(num));
	}
}
