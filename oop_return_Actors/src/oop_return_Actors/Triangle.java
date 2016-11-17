package oop_return_Actors;

public class Triangle 
{
	public double Area(double a,double b,double c,double s)
	{
		return java.lang.Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	interface MathOper
	{
		double operation(double a,double b,double c);
	}

	public double operate(double a, double b,double c, MathOper mathOperation){
	      return mathOperation.operation(a, b,c);
	   }
}
