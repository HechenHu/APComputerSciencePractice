package set1_if_else_labs;

public class WordsCompare 
{
	public void printResult(String a,String b)
	{
		System.out.println(a+(a.compareTo(b)>0?" should be placed after ":" should be placed before ")+b+"\n");
	}
}
