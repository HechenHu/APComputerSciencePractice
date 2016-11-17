package set1_forloop_labs;

public class Word 
{
	public void printResult(String input)
	{
		String result = new StringBuilder(input).reverse().toString();
		System.out.println(input.charAt(0));
		System.out.println(input.charAt(input.length()-1));
		System.out.println(result);
		System.out.println(input+"\n");
	}
}
