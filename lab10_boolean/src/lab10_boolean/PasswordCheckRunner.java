package lab10_boolean;
import java.util.Scanner;

public class PasswordCheckRunner 
{
	public static void main(String args[])
	{
		PasswordCheck test = new PasswordCheck("password");
		Scanner keyboard = new Scanner(System.in);
		test.Check(keyboard);
	}
}
