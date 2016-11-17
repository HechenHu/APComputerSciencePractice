import java.util.Scanner;
public class StringCheckerRunner 
{
	public static void main(String args[])
	{
		StringChecker strch = new StringChecker();
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" input original string");
		String input = keyboard.nextLine();
		System.out.println(" Now Input Target SubString");
		String target = keyboard.nextLine();
		strch.MatchPattern(input,target);
		keyboard.close();
		strch = null;
		input = null;
		target = null;
	}
}
