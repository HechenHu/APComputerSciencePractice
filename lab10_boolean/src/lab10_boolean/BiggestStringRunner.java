package lab10_boolean;

public class BiggestStringRunner 
{
	public static void main(String args[])
	{
		BiggestString test = new BiggestString();
		test.PrintResult("abc","cba","bca");
		test.PrintResult("one","fourteen","twenty");
		test.PrintResult("124323","20009","3434");
		test.PrintResult("abcde","ABCDE","1234234324");
	}
}
