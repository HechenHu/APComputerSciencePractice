package lab09_while_dowhile;

public class LetterRemoverRunner 
{
	public static void main(String args[])
	{
		LetterRemover test = new LetterRemover();
		test.PrintResult("I am Sam I am", 'a');
		test.PrintResult("ssssssssxssssesssssesss", 's');
		test.PrintResult("qwertyqwertyqwerty", 'a');
		test.PrintResult("abababababa", 'b');
		test.PrintResult("abaababababa", 'x');
	}
}
