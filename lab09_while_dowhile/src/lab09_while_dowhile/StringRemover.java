package lab09_while_dowhile;

public class StringRemover 
{
	public void PrintResult(String input,String RemoveTarget)
	{
		System.out.println(input+"  - String to remove  "+RemoveTarget+"\n"+ReturnResult(input,RemoveTarget));
	}
	public String ReturnResult(String input,String RemoveTarget)
	{
			input = input.replaceAll("."+RemoveTarget+"|"+RemoveTarget,"");
		return input;
	}
}
