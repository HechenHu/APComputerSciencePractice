
public class AverageRunner 
{
	public static void main(String args[])
	{
		Average test = new Average();
		test.workflow(5, 5);
		test.workflow(90, 100.0);
		test.workflow(100,85.8);
		test.workflow(-100,55);
		test.workflow(15236,5642);
		test.workflow(1000,555);
	}
}
