
public class CharacterAnalyzer 
{
	public void printResult(char input)
	{
		if(Character.isLetter(input))
		{
			String out = Character.isUpperCase(input)?" Is Uppercase . ":" Is Lowercase . ";
			System.out.println(input + out+" ASCII == "+((int)input)+"\n");
		}
		else if(Character.isDigit(input))
		{
			System.out.println(input + " Is Digit . ASCII == "+((int)input)+"\n");
		}

	}
}
