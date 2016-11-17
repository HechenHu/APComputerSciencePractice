package oop_return_Actors;

public class Distance 
{
	Distance()
	{
		printDist(1,1,2,1);
		printDist(1,1,-2,2);
		printDist(1,1,0,0);
	}
	public static double CalDistance(double x1,double y1 ,double x2, double y2)
	{
		return java.lang.Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
	}
	public void  printDist(double x1,double y1 ,double x2, double y2)
	{
		System.out.println(CalDistance(x1, y1 , x2, y2));
	}
}
