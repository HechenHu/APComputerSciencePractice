
public class Fahrenheit 
{	
	public double tempinf;
	public double convert(double f)
	{
		tempinf = f ;
		return (f-32)*5/9 ;
	}
	public void print(double f)
	{
		System.out.println(tempinf + " degrees Fahrenheit == " + f + " degrees Celsius ");
	}
}
