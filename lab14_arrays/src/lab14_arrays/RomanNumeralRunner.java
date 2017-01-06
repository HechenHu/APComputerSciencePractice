package lab14_arrays;

public class RomanNumeralRunner 
{
	public static void main(String args[])
	{
		RomanNumeral test = new RomanNumeral();
		test.printResult("10");
		test.printResult("100");
		test.printResult("1000");
		test.printResult("2500");
		test.printResult("23");
		test.printResult("38");
		test.printResult("49");
		test.printResult("LXXVII");
		test.printResult("XLIX");
		test.printResult("XX");
		test.printResult("XXXVIII");
		test = null;
	}
}
