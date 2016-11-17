package lab09_while_dowhile;

public class DigitMath 
{
	public void printResult(int num)
	{
		int sum=0;
		int tempnum=num;
		System.out.print(num+"  has a digit average of ");
		int DigitCount=0;
		while(num>0)
		{
			DigitCount++;
			num/=10;
			sum+=tempnum%10;
			tempnum/=10;
		}
		System.out.print((float)sum/DigitCount+"\n");
	}
}
