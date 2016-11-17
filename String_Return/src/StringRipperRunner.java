import java.util.Scanner;
public class StringRipperRunner 
{
	public static void main(String args[])
	{
		StringRipper ripper = new StringRipper();
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		ripper.printResult(input);
		keyboard.close();
	}
}
