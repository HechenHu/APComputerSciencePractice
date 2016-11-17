package set1_forloop_labs;

public class ForLoopDemo 
{
	public void printResult(int start,int end,int increment)
	{
		System.out.println("Start:: "+start+" Stop:: "+end+" increment:: "+increment );
		for(;start<end;start+=increment)
		{	
			if(start+increment<end)
				System.out.print(start+",");
			else
				System.out.print(start);
			
		}
		System.out.println("\n");
	}
}
