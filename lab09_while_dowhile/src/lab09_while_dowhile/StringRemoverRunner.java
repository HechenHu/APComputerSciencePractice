package lab09_while_dowhile;

public class StringRemoverRunner 
{
	public static void main(String args[])
	{
		StringRemover test = new StringRemover();
		test.PrintResult("xR-MxR-MHelloxR-M","R-M");
		test.PrintResult("sxssxsxssxsxssexssxsesss","xs");
		test.PrintResult("fuxqwertyxqwertyxqwertyxqwertyrqwertyxqwertyrqwertyn","qwerty");
	}
}
