import java.util.Scanner;
public class NameRunner 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		Name name = new Name();
		name.MatchPattern(input,"(\\s)");
		name.printResult(input);
		keyboard.close();
		name = null;
		input = null;
	}
}
