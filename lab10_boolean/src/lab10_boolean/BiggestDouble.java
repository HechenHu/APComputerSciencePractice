package lab10_boolean;

public class BiggestDouble 
{
	public double ReturnResult(double... numbers)
	{
		double max = 0.00;
		for(double d:numbers)
		{
			max = d>=max?d:max;
		}
		return max;
	}
	public void printResult(double...numbers)
	{
		for(double d :numbers)
		{
			System.out.print(d+" ");
		}
		System.out.println("\n"+"The Biggest Double :: "+ReturnResult(numbers));
	}
}
