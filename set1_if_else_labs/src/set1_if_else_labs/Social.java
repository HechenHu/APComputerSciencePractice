package set1_if_else_labs;

public class Social 
{
	public void printResult(String SSN)
	{
		System.out.println(
		" SSN "+SSN+" has a sum of "+( 
		Integer.parseInt(SSN.substring(0,SSN.indexOf('-')))+
		Integer.parseInt(SSN.substring(SSN.indexOf('-')+1,SSN.lastIndexOf('-')))+
		Integer.parseInt(SSN.substring(SSN.lastIndexOf('-')+1))
		)
		);
	}
}
