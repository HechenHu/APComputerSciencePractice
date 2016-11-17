package lab11_nested_loops;


public class Triples 
{
	public boolean isOdd(int number)
	{
		return number%2!=0;
	}
	public boolean coPrime(int a,int b,int c)
	{
		if((a%5+b%5+c%5)==0)
			return false;
		else if((a%2+b%2+c%2)==0)
				return false;
			else if((a%3+b%3+c%3)==0)
					return false;
				else if((a%7+b%7+c%7)==0)
						return false;
		return true;
	}
	public void printResult(int max)
	{
		int a=1,b=1,c=1;
		for(a=1;a<=max;a++)
		{
			for(b=1;b<=max;b++)
			{
				for(c=1;c<=max;c++)
				{
					if((a*a+b*b==c*c))
					{
						if((isOdd(a)!=isOdd(b))&&isOdd(c))
						{
							if(coPrime(a, b, c)&&a<b&&b<c)
							{
								System.out.println(a+"  "+b+"  "+c);
							}
							else
								continue;
						}
					}
					else
						continue;
				}
			}
		}
	}
}
