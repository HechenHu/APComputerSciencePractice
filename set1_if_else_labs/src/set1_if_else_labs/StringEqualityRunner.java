package set1_if_else_labs;

public class StringEqualityRunner 
{	
	public static void main(String args[])
	{
		StringEquality s = new StringEquality();
		s.printResult("hello","goodbye");
		s.printResult("one","two");
		s.printResult("three","four");
		s.printResult("TCEA","UIL");
		s.printResult("State","Champions");
		s.printResult("ABC","ABC");
		s.printResult("ABC","CBA");
		s.printResult("Same","Same");
	}

}
