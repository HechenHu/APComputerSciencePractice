import java.util.*;
public class HexToBinary {
	private Map<String,String> BinaryCode = new HashMap<String, String>();
	public HexToBinary()
	{
	BinaryCode.put("A","1010");	
	BinaryCode.put("B","1011");	
	BinaryCode.put("C","1100");	
	BinaryCode.put("D","1101");	
	BinaryCode.put("E","1110");	
	BinaryCode.put("F","1111");	
	}
	public void printResult(String input)
	{
		System.out.println(input+" is "+(BinaryCode.get(input)!=null?BinaryCode.get(input):"ERROR")+" in Binary ");
	}
}
