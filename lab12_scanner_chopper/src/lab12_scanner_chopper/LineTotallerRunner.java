package lab12_scanner_chopper;
import java.util.*;

public class LineTotallerRunner 
{                           
	public static void main(String args[])
	{
		LineTotaller test = new LineTotaller();
		System.out.println("Sum = "+test.returnResult());
	}
	
	//public static void main(String[] args)
    //{
    //   Scanner sc = new Scanner(System.in);
    //    ArrayList<Integer> numbers = new ArrayList<Integer>();
    //    while (sc.hasNextInt()) { // this loop breaks there is no more int input.
    //        numbers.add(sc.nextInt());
    //    }
    //    System.out.println(numbers);
    //}
}
