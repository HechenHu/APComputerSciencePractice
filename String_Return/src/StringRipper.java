import java.util.Random;
public class StringRipper 
{
	public void printResult(String text)
	{
		Random ran = new Random();
		int i;
		for(i=0;i<=10;i++)
		{
			int start = ran.nextInt(text.length()-ran.nextInt(text.length()));
			int end = randomInARange(start,text.length());
			while(text.contains("\\s"))
			{
				end++;
			}
				System.out.println(text.substring(start,end));
		}
		
	}
	public int randomInARange(int min,int max)
	{
		if (min >= max) 
		{
			return -1;
		}
		else
		{
		Random ran = new Random();
		return ran.nextInt((max - min) + 1) + min;
		}

	}
	
}
