package lab09_while_dowhile;
import java.util.*;

public class TenToAny 
{
	public ArrayList<String> Hex = new ArrayList<String>(Arrays.asList("0", "1","2", "3","4", "5","6", "7","8", "9","A", "B","C", "D","E", "F"));
	public void printResult(int number,int base)
	{
		System.out.println(number+" in base 10 is "+ReturnResult(number,base)+" in base "+base);
	}
	public String ReturnResult(int number,int base)
	{
		String Result="";
		if(base<=9)
		{
			while(number>0)
			{
				
				Result=number%base+Result;
				number=(number-(number%base))/base;
			}
		}
		else if(base<=16)
		{
			while(number>0)
			{
				Result=Hex.get(number%base)+Result;
				number=(number-(number%base))/base;
			}
		}
		return Result;

	}
}
