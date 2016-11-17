package lab09_while_dowhile;

public class DigitCounter 
{
	public void printResult(int num)
	{
		System.out.print(num+" Contains ");
		int DigitCount=0;
		while(num>=10)
		{
			DigitCount++;
			num/=10;
		}
		DigitCount++;
		System.out.println(DigitCount+" Digits \n");
	}
	public int ReturnResult(int num)
	{
		int DigitCount=0;
		while(num>=10)
		{
			DigitCount++;
			num/=10;
		}
		DigitCount++;
		return DigitCount;
	}
}
