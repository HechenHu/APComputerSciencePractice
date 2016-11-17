
public class FahrenheitRunner 
{
	public static void main(String args[])
	{
		Fahrenheit FtoC = new Fahrenheit();
		FtoC.print(FtoC.convert(98.6));
		FtoC.print(FtoC.convert(52.30));
		FtoC.print(FtoC.convert(82.45));
		FtoC.print(FtoC.convert(75.00));
		FtoC.print(FtoC.convert(100.00));
	}
}
