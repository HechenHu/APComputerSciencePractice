package lab11_nested_loops;

public class TriangleFourRunner 
{
	public static void main(String args[])
	{
		TriangleOne test = new TriangleOne();
		while(test.SU.keyboardGetStatus(""))
		{
			test.printTriangle("TriangleFour");
		}

	}
}
