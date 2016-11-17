package lab09_while_dowhile;

public class ReverseNumber 
{
	public void printResult(int num)
	{
		DigitCounter count = new DigitCounter();
		System.out.print(num+" reversed is ");
		int DigitNum = count.ReturnResult(num);
		int i=1;
		int OutPut=0;
		while(i<=DigitNum)
		{
			OutPut+=num%10*Math.pow((double)10,(double)(DigitNum-i));
			num/=10;
			i++;
		}

		System.out.println(OutPut+"\n");
	}
}
