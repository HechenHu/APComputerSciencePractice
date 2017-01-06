package lab15_sort_search_24;
import java.util.*;
import SUPPORT.*;
public class NumberSearch 
{
	Support SU = new Support();
	ArrayList<Integer> UsrInput = new ArrayList<Integer>();
	
	public void printResult()
	{
		for(String s:SU.returnKeyboard().nextLine().split(" "))
		{
			UsrInput.add(Integer.parseInt(s));
		}
	}
}
