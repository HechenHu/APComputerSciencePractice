package set1_forloop_labs;

public class TriangleOne 
{
	public void printResult(String input)
	{
		int i;
		for(i=0;i<=input.length();i++)
		{
			System.out.println(input.substring(0, input.length()-i));
		}
	}
}
