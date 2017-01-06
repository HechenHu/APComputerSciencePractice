package lab15_sort_search_24;
import SUPPORT.*;
import java.util.*;
public class WordSort 
{
	private Support SU = new Support();
	
	public void returnResult()
	{
		String[] Input = SU.returnKeyboard().nextLine().split(" ");
		Arrays.sort(Input);
		int count = 0;
		for(String s : Input)
		{
			System.out.println("Word " +count +" :: "+s);
			count++;
		}

	}
}
