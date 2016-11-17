import java.util.Scanner;
public class AddStringsRunner 
{
	public static void main(String args[])
	{
		AddStrings addstr = new AddStrings();
		Scanner keyboard = new Scanner(System.in);
		String a = keyboard.nextLine();
		String b = keyboard.nextLine();
		addstr.Add(a, b);
		keyboard.close();
	}
}
