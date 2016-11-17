package set1_forloop_labs;

public class LoopStats 
{
	public void printResult(int start,int end)
	{
		int evencount=0;
		int sum=0;
		int loopcount;
		for(loopcount=start;loopcount<=end;loopcount++)
		{
			evencount+=loopcount%2==0?1:0;
			sum+=loopcount;
		}
		System.out.println("Total: "+sum);
		System.out.println("Evencount: "+evencount);
		System.out.println("Oddcount: "+(end-start+1-evencount)+"\n");
	}
}
