
public class Decoder 
{
	public void printResult(String input)
	{
		String output = input.matches("[A-Z]")?input.toLowerCase():((input.matches("[a-z]")?input.toUpperCase():((input.matches("[0-9]")?String.valueOf((char)(Integer.parseInt(input)+65)):"#"))));
		System.out.println(input + " Decodes to " + output+"\n");
		output = null;
	}
}
