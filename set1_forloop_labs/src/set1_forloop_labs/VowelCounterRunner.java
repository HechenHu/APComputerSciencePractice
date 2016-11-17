package set1_forloop_labs;

public class VowelCounterRunner 
{
	public static void main(String args[])
	{
		VowelCounter test = new VowelCounter();
		test.printResult("abcdef".toCharArray());
		test.printResult("hhhhhhh".toCharArray());
		test.printResult("aaaaaaa".toCharArray());
		test.printResult("catpigdatrathogbogfrogmoosegeese".toCharArray());
		test.printResult("hhhhhhh1234356HHHHDH".toCharArray());
		test.printResult("AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj".toCharArray());
	}
}
