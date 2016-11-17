package set1_if_else_labs;

public class StringFirstLetterCheckRunner 	
{
	public static void main(String args[])
	{
		StringFirstLetterCheck test = new StringFirstLetterCheck();
		test.printResult("hello","howdy");
		test.printResult("one","two");
		test.printResult("three","two");
		test.printResult("TCEA","UIL");
		test.printResult("State","Champions");
		test.printResult("ABC","DEF");
	}
}
