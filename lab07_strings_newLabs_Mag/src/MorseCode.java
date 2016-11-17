import java.util.*;
public class MorseCode 
{
	private Map<String,String> MorseCode = new HashMap<String, String>();
	public MorseCode()
	{
		MorseCode.put("A",".-");
		MorseCode.put("B"," -... ");
		MorseCode.put("C","-.-. ");
		MorseCode.put("D","-..");
		MorseCode.put("E",".");
		MorseCode.put("F","..-.");
		MorseCode.put("G","--.");
		MorseCode.put("H","....");
		MorseCode.put("I","..");
		MorseCode.put("J",".---");
		MorseCode.put("K","-.-");
		MorseCode.put("L",".-..");
		MorseCode.put("M","--");
		MorseCode.put("N","-.");
		MorseCode.put("O","---");
		MorseCode.put("P",".--.");
		MorseCode.put("Q","--.- ");
		MorseCode.put("R",".-.");
		MorseCode.put("S","...");
		MorseCode.put("T","-");
		MorseCode.put("U","..-");
		MorseCode.put("V","...-");
		MorseCode.put("W",".-- ");
		MorseCode.put("X","-..-");
		MorseCode.put("Y","-.--");
		MorseCode.put("Z","--..");
		MorseCode.put("0","-----");
		MorseCode.put("1",".----");
		MorseCode.put("2","..---");
		MorseCode.put("3","...--");
		MorseCode.put("4","....-");
		MorseCode.put("5",".....");
		MorseCode.put("6","-....");
		MorseCode.put("7","--...");
		MorseCode.put("8","---..");
		MorseCode.put("9","----.");
	}
	public void printResult(String character)
	{
		System.out.println(character+" is "+MorseCode.get(character)+" in Morse! \n");
	}
}
