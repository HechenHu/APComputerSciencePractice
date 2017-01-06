package lab14_arrays;
import SUPPORT.*;
import java.util.*;
public class RomanNumeral 
{
	private final static TreeMap<Integer, String> Intmap = new TreeMap<Integer, String>();
	private final static HashMap<String, Integer> Romanmap = new HashMap<String, Integer>();
    static {

        Intmap.put(1000, "M");
        Intmap.put(900, "CM");
        Intmap.put(500, "D");
        Intmap.put(400, "CD");
        Intmap.put(100, "C");
        Intmap.put(90, "XC");
        Intmap.put(50, "L");
        Intmap.put(40, "XL");
        Intmap.put(10, "X");
        Intmap.put(9, "IX");
        Intmap.put(5, "V");
        Intmap.put(4, "IV");
        Intmap.put(1, "I");
        
        Romanmap.put("M",1000);
        Romanmap.put("CM",900);
        Romanmap.put("D",500);
        Romanmap.put("CD",400);
        Romanmap.put("C",100);
        Romanmap.put("XC",90);
        Romanmap.put("L",50);
        Romanmap.put("XL",40);
        Romanmap.put("X",10);
        Romanmap.put("IX",9);
        Romanmap.put("V",5);
        Romanmap.put("IV",4);
        Romanmap.put("I",1);

    }

	Support SU = new Support();
	public int toDecimal(String number) 
	{
		int sum=0;
		while(number!=""&&number.length()>=2)
		{
			if(Romanmap.containsKey(number.substring(0,2)))
			{
				sum+=Romanmap.get(number.substring(0,2));
				number = number.substring(2);
			}
			else if(Romanmap.containsKey(number.substring(0,1)))
			{
				sum+=Romanmap.get(number.substring(0,1));
				number = number.substring(1);
			}
		}

			if(number.length()==2&&Romanmap.containsKey(number))
			{
				sum+=Romanmap.get(number);
				number = "";
			}
			else if(number.length()==1&&Romanmap.containsKey(Character.toString(number.charAt(0))))
			{
				sum+=Romanmap.get(number);
				number = "";
			}
		return sum;
    }
	
	public final static String toRoman(int number)
	{
        int l =  Intmap.floorKey(number);
        if ( number == l ) {
            return Intmap.get(number);
        }
        return Intmap.get(l) + toRoman(number-l);
    }
	
	public void printResult(String input)
	{
		System.out.print(input+" is ");
		if(input.matches("^[A-Z]*$"))
		{
			System.out.println(toDecimal(input));
			return;
		}
		else if(input.matches("^[0-9]*$"));
		{
			System.out.println(toRoman(Integer.parseInt(input)));
			return;
		}
	}
}

