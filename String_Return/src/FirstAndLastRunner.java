import java.util.Scanner;
public class FirstAndLastRunner 
{
	public static void main(String args[])
	{
		FirstAndLast first = new FirstAndLast();
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		first.printResult(input);
		keyboard.close();
		first = null;
		input = null;
		
	}

}
