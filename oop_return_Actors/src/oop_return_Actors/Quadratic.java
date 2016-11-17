package oop_return_Actors;


public class Quadratic 
{
	interface MathOper
	{
		double operation(double a,double b,double c);
	}

	public double operate(double a, double b,double c, oop_return_Actors.Triangle.MathOper math){
	      return math.operation(a, b,c);
	   }
	
}
