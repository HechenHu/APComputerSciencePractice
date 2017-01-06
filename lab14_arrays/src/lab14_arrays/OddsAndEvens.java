package lab14_arrays;
import SUPPORT.*;

import java.util.*;
public class OddsAndEvens 
{
	Support SU = new Support();
	ArrayList<Number> OddNum = new ArrayList<Number>();
	ArrayList<Number> EvenNum = new ArrayList<Number>();
	public void printresult()
	{
		String[] Input = SU.returnKeyboard().nextLine().split(" ");
		for(String str : Input)
		{
			if(Integer.parseInt(str)%2==0)
			{
				EvenNum.add(Integer.parseInt(str));
			}
			else if(Integer.parseInt(str)%2!=0)
			{
				OddNum.add(Integer.parseInt(str));
			}
		}
		System.out.println("Odds - "+OddNum);
		System.out.println("Evens - "+EvenNum);
	}
}
