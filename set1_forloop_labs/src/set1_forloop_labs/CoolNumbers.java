package set1_forloop_labs;

public class CoolNumbers 
{
	public boolean isCoolNumber(int num)
	{
		return (num%3==1)&&(num%4==1)&&(num%5==1)&&(num%6==1);
	}
	public void printResult(int bound)
	{
		int i,count=0;
		for(i=6;i<=bound;i++)
		{
			count+=isCoolNumber(i)?1:0;
		}
		System.out.println(count+" Cool Numbers between 6 -- "+bound+"\n");
	}
}
