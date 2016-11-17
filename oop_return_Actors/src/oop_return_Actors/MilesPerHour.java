package oop_return_Actors;

public class MilesPerHour 
{
	public double MPHCal(double distance,double hours,double minutes)
	{
		
		return distance/(minutes/60+hours);
	}
	public void printResult(double distance,double hours,double minutes)
	{
		System.out.println(distance + " miles in " + hours + " Hours and " + minutes+" Minutes == "+ MPHCal(distance, hours, minutes));
	}
}
