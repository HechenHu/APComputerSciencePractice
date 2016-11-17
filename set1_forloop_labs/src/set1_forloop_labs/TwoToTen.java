package set1_forloop_labs;
import java.util.*;

public class TwoToTen 
{
	public void printResult(String input)
	{
		ArrayList<Integer> bin = new ArrayList<Integer>(StringToIntArray(input));
		int i=0;
		int dec=0;
		for (i=0;i<=bin.size()-1;i++)
		{
			dec+=(Math.pow(2,bin.size()-i-1)*bin.get(i));
			System.out.println("2^"+(bin.size()-i-1)+" * "+bin.get(i)+" == " +Math.pow(2,bin.size()-i-1)*bin.get(i));
		}
		System.out.println(input+" == "+dec);
	}
	public ArrayList<Integer> StringToIntArray(String input)
	{
		ArrayList<Integer> out = new ArrayList<Integer>();
		int i;
		for(i=0;i<input.length();i++)
		{
			out.add(Integer.parseInt(input.substring(i,i+1)));
		}
		System.out.println(out);
		return out;
	}
}
