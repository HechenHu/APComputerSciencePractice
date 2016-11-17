package lab11_nested_loops;
import SUPPORT.*;
public class TriangleOne 
{
	Support SU = new Support();
	public void printTriangle(String args)
	{
		Object [] o = new Object[2];
		String [] alphaBet = new String [52];

		
		int i =0;
		for(i=0;i<26;i++)
		{
			alphaBet[i] = Character.toString((char)("A".charAt(0)+i+1) );
		}
		for(i=25;i<52;i++)
		{
			alphaBet[i] = Character.toString((char)("A".charAt(0)+i-25) );
		}
		if(args.matches("TriangleTwo"))
		{
			o = SU.GetMultipleInput(2);
			for(i=1;i<=Integer.parseInt(o[0].toString());i++)
			{
				printCh(Integer.parseInt(o[0].toString())-i+1,o[1].toString());
				System.out.print("\n");
			}
		}
		else if(args.matches("TriangleOne"))
		{
			o = SU.GetMultipleInput(2);
			for(i=1;i<=Integer.parseInt(o[0].toString());i++)
			{
				printCh(i,o[1].toString());
				System.out.print("\n");
			}
		}
		else if(args.matches("TriangleThree"))
		{
			o = SU.GetMultipleInput(2);
			for(i=1;i<=Integer.parseInt(o[0].toString());i++)
			{
				printCh(Integer.parseInt(o[0].toString())-i," ");
				printCh(i,o[1].toString());
				System.out.print("\n");
			}
		}
		else if(args.matches("TriangleFour"))
		{
			o = SU.GetMultipleInput(2);
			for(i=1;i<=Integer.parseInt(o[0].toString());i++)
			{
				printCh(i-1," ");
				printCh(Integer.parseInt(o[0].toString())-i+1,o[1].toString());
				System.out.print("\n");
			}
		}
		else if(args.matches("Box"))
		{
			o = SU.GetMultipleInput(1);
			for(i=1;i<=Integer.parseInt(o[0].toString());i++)
			{
				printCh(Integer.parseInt(o[0].toString())-i+1,"*");
				printCh(i,"#");
				System.out.print("\n");
			}
		}
		else if(args.matches("BoxWord"))
		{
			String s = SU.GetSingleInput("string").toString();
			System.out.println(s);
			for( i = 1;i<s.length()-1;i++)
			{
				printCh(1,Character.toString(s.charAt(i)));
				printCh(s.length()-2," ");
				printCh(1,Character.toString(s.charAt(s.length()-i-1)));
				System.out.print("\n");
			}
			System.out.println(new StringBuffer(s).reverse().toString());
		}
		else if(args.matches("TriangleFive"))
		{
			o = SU.GetMultipleInput(2);
			int count = 0;
			for(count =Integer.parseInt(o[1].toString())-1;count>=0;count--)
			{
				for(i=0;i<=count;i++)
				{
					printCh(Integer.parseInt(o[1].toString())-i,alphaBet[(int)(o[0].toString().charAt(0)+i)-66]);
					printCh(1," ");
				}
				System.out.println("\n");
			}
		}
		else if(args.matches("TriangleWord"))
		{
			String s = SU.GetSingleInput("string").toString();
			printCh(s.length()-1," ");
			System.out.println(s.charAt(0));
			for(i=1;i<s.length()-1;i++)
			{
				printCh(s.length()-i-1," ");
				System.out.print(s.charAt(i));
				printCh(i*2-1," ");
				System.out.print(s.charAt(i));
				System.out.print("\n");
				
			}
			for(i=0;i<s.length();i++)
			{
				printCh(1,Character.toString(s.charAt(s.length()-i-1)));
			}
			for(i=0;i<s.length()-1;i++)
			{
				printCh(1,Character.toString(s.charAt(i+1)));
			}
			
		}

	}
	public void printCh(int num,String ch)
	{
		for(int i = 1;i<=num;i++)
		{
			System.out.print(ch);
		}

	}
}
