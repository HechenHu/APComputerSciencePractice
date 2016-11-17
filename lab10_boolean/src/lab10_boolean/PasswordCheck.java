package lab10_boolean;
import java.util.Scanner;

public class PasswordCheck 
{
	private String password;
	public PasswordCheck(String pwd)
	{
		password = pwd;
	}
	public void Check(Scanner keyboard)
	{
		String input;
		do
		{
			input = keyboard.nextLine();
			if(input.equals(password))
			{
				System.out.println("VALID");
				break;
			}
			else
				System.out.println("INVALID");
		}while(keyboard.hasNextLine());
	}
}
