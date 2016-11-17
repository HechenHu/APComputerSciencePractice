package oop_return_Actors;
import oop_return_Actors.Triangle.MathOper;

public class TriangleRunner 
{
	public static void main(String args[])
	{
		Triangle Tri = new Triangle();  
		MathOper sum = ( double a,double b, double c) -> {return (a+b+c)/2;};
		double a,b,c;
		System.out.println(Tri.Area(3, 3, 3, Tri.operate(3,3,3,sum)));
		System.out.println(Tri.Area(7, 8, 9, Tri.operate(7,8,9,sum)));
		System.out.println(Tri.Area(10,9, 11, Tri.operate(10,9,11,sum)));
	}

}
