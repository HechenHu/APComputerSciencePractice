package lab14_arrays;
import SUPPORT.*;
import java.util.*;
public class ArrayStats 
{
	private ArrayList<ArrayList<String>> Count = new ArrayList<ArrayList<String>>();
	Support SU = new Support();
	public void initArrayList()
	{
		String UsrInput = SU.returnKeyboard().nextLine();
		String numberOccurenceCount = "";
		for(String s : UsrInput.split(" "))
		{
			if(numberOccurenceCount.contains(s))
			{
				for(ArrayList<String> a:Count)
				{
					if(a.contains(s))
					{
						a.add(s);
						continue;
					}
				}
			}
			else
			{
				numberOccurenceCount +=s;
				Count.add(new ArrayList<String>(Arrays.asList(s)));
			}
		}
		
		
		
	}
	public void printResult()
	{
		String maxCount = "";
		for(ArrayList<String> a: Count)
		{
			if(maxCount.contains(Integer.toString(a.size())))
			{
				continue;
			}
			else
			{
				maxCount =maxCount + Integer.toString(a.size())+" ";
			}
		}
		int count = 0;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(String s: maxCount.split(" "))
		{
		temp.add(Integer.parseInt(s));
		}
		Collections.sort(temp);

			for(int i: temp)
			{
				System.out.print("size "+ i +" count == ");
				for(ArrayList<String> a:Count)
				{
					count += (a.size()>=i?1:0);
				}
				System.out.println(count);
				count = 0;
			}

	}
}
