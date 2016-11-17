package set1_forloop_labs;

public class VowelCounter 
{
	public void printResult(char[] input)
	{
		System.out.println(input);
		int i=0,count=0;
		for(i=0;i<=input.length-1;i++)
		{
			
			if(isVowel(input[i]))
					{
					input[i]=(char)count;	
					count++;
					}
		}
		System.out.println(input+"\n"+count);
	}
	public boolean isVowel(char i)
	{
		return i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U';
	}
}
