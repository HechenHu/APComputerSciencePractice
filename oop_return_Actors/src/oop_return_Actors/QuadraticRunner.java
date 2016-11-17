package oop_return_Actors;



import oop_return_Actors.Triangle.MathOper;

public class QuadraticRunner 
{
	public static void main(String args[])
	{
		Quadratic Quad = new Quadratic();  

		printRoot(5,-8,3,Quad);
		printRoot(3,2,-7,Quad);
		printRoot(9,6,1,Quad);
	}
	public static void printRoot(double a,double b,double c,Quadratic Quad)
	{
		MathOper root1 = (i,j,k) -> {return ((-j)+java.lang.Math.sqrt(j*j-4*i*k))/(2*i) ;};
		MathOper root2 = (i,j,k) -> {return ((-j)-java.lang.Math.sqrt(j*j-4*i*k))/(2*i) ;};
		if (Quad.operate(a, b, c, root1)==Quad.operate(a, b, c, root2))
		{
			System.out.println("root 1 == root2 == " + Quad.operate(a, b, c, root1));
		}
		else if(Quad.operate(a, b, c, root1)==Quad.operate(a, b, c, root1))
		{
			System.out.println("root1 == " +Quad.operate(a, b, c, root1));
			System.out.println("root2 == " +Quad.operate(a, b, c, root2));
		}
	}
	
}
