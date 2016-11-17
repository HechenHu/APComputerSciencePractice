package set1_if_else_labs;

public class SocialRunner 
{
	public static void main(String args[])
	{
		Social test = new Social();
		test.printResult("456-56-234");
		test.printResult("1-1-1");
		test.printResult("102-2-12");
		test.printResult("0-0-0");
		test = null;
	}
}
