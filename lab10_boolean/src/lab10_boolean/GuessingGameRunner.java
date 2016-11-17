package lab10_boolean;

public class GuessingGameRunner
{
	public static void main(String args[])
	{
		GuessingGame test = new GuessingGame();
		while(true)
		{
			try
			{
				test.Game();
			}
			catch(NullPointerException exp)
			{
				break;
			}
		}

	}
}
