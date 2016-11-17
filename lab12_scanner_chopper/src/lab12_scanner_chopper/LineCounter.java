package lab12_scanner_chopper;
import SUPPORT.*;
public class LineCounter 
{
	private Support SU = new Support();
	public int returnResult()
	{
		int i =0;
		
		while(SU.keyboardGetStatus("")&&SU.GetSingleInput().toString()!="")
		{
			i++;
		}
		return i;
	}
}
