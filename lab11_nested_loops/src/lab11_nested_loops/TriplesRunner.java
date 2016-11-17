package lab11_nested_loops;
import SUPPORT.*;

public class TriplesRunner 
{
	public static void main(String args[])
	{
		Triples test = new Triples();
		Support SU = new Support();
		while(true)
		{
			 test.printResult((int)SU.GetSingleInput("int"));
		}



	}
}
