
public class Discount 
{
	public void printResult(double number)
	{
		double finalNumber = number>2000?number*85/100:number;
		System.out.println("Enter the original bill amount :: "+number);
		System.out.println("Bill after discount :: "+finalNumber+'\n');
	}
}
