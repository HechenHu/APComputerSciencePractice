package set1_forloop_labs;

public class Prime 
{
	public void printResult(long num)
	{
		
		System.out.println(num+(isPrime(num)?" is prime":" is not prime"));
	}
	public boolean isPrime(long num)
	{
		int i = 0;
		boolean result=false;
		for(i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			else
				continue;
		}
		return true;
	}
}
