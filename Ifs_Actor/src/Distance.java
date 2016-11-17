
public class Distance 
{
	public void printResult(double x1,double y1,double x2,double y2)
	{
		String out = returnDistance(x1,y1)<returnDistance(x2,y2)?"A is Closer":"B is Closer";
		System.out.println(out+"\n");

	}
	public double returnDistance(double x,double y)
	{
		return java.lang.Math.sqrt(x*x+y*y);
	}
	}
