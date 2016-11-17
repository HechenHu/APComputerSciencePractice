package lab10_boolean;

public class BiggestString 
{
	public String ReturnResult(String... inputs)
	{
		String max="";
		for(String s :inputs)
		{
			max = s.compareTo(max)>0?s:max;
		}
		return max;
	}
	
	public void PrintResult(String... inputs)
	{
		for(String s:inputs)
		{
			System.out.print(s+" ");
		}
		System.out.println("\n"+"Biggest :: "+ReturnResult(inputs));
	}
}
