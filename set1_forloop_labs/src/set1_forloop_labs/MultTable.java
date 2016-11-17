package set1_forloop_labs;

public class MultTable 
{
	public void printResult(int base,int row)
	{
		int i =1;
		System.out.println("Multiplication Table for "+ base);
		for(i=1;i<=row;i++)
		{
			System.out.println(i+"      "+base*i);
		}
		System.out.println("\n");
	}
}
