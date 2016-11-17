package lab09_while_dowhile;

public class DigitAdder 
{
	public void printResult(int num)
	{
		String output =" is the sum of the digits of "+num;
		int sum=0;
		while(num>0)
		{
			sum+=num%10;
			num/=10;
		}
		output=sum+output;
		System.out.println(output+"\n");
	}
}
