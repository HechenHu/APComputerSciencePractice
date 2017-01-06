package lab14_arrays;
import java.util.*;
import SUPPORT.*;
public class Histogram 
{
	Support SU = new Support();
	int[] Count = {0,0,0,0,0,0,0,0,0,0};

	public void printresult()
	{
		String[] Input = SU.returnKeyboard().nextLine().split(" ");
		for(String str : Input)
		{
			Count[Integer.parseInt(str)]+=1;
		}
		for(int i = 0;i<Count.length;i++)
		{
			System.out.println(i+" -- "+Count[i]);
		}
	}
}
