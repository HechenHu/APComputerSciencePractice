package lab12_scanner_chopper;
import SUPPORT.*;

import java.util.*;
public class LineTotaller 
{
	private Support SU = new Support();
	
	public int returnResult()
	{
		ArrayList<Number> numbers = new ArrayList<Number>();
		while(SU.keyboardGetStatus("hasNextInt"));
		{
				System.out.println(" asjkah f");
				numbers.add(((Number)SU.GetSingleInput("int")).intValue());
				System.out.println(numbers);
		}
		return SU.Reduce(numbers).intValue();
	}
}
