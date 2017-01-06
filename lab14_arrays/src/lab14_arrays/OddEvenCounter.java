package lab14_arrays;
import SUPPORT.Support;

public class OddEvenCounter 
{
	Support SU = new Support();
	private String[] Input = SU.returnKeyboard().nextLine().split(" ");
	public int returnOddCount()
	{
		int OddNum = 0;
		for(String s :Input)
		{
			OddNum += Integer.parseInt(s)%2!=0?1:0;
		}
		return OddNum;
	}
	public int returnEvenCount()
	{
		int OddNum = 0;
		for(String s :Input)
		{
			OddNum += Integer.parseInt(s)%2==0?1:0;
		}
		return OddNum;
	}
}
