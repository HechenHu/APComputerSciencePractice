package SUPPORT;
import java.util.*;
public class Support 
{
	Scanner keyboard = new Scanner(System.in);
	Random ranGen = new Random();
	public int ReturnRandom(int...args)
	{
		int GenValue=-1000;
			switch(args.length)
			{
			case 1:return ranGen.nextInt(args[0]);
			case 2:return args[0]+ranGen.nextInt(args[1]);
			default:while(true)
			{
				if(!HasValue(GenValue,args))
				{
					GenValue=ReturnRandom(args[0],args[1]);
				}
				else
					return GenValue;
			}
			}
	}
	
	public boolean HasValue(Object Value,Object... args)
	{
		for(Object o :args)
		{
			if (o.equals(Value))
				return true;
			else
				continue;
		}
		return false;
	}
	
	public boolean keyboardGetStatus(String arg)
	{
		if(arg.matches("hasNextInt"))
		{
			return keyboard.hasNextInt();
		}
		else if(arg.matches("hasNextBoolean"))
		{
			return keyboard.hasNextBoolean();
		}
		else if(arg.matches("hasNextByte"))
		{
			return keyboard.hasNextByte();
		}
		else if(arg.matches("hasNextDouble"))
		{
			return keyboard.hasNextDouble();
		}
		else if(arg.matches("hasNextFloat"))
		{
			return keyboard.hasNextFloat();
		}
		else if(arg.matches("hasNextLong"))
		{
			return keyboard.hasNextLong();
		}
		else if(arg.matches("hasNextShort"))
		{
			return keyboard.hasNextShort();
		}
		else if(arg.matches("hasNextline"))
		{
			return keyboard.hasNextLine();
		}
		else
			return keyboard.hasNext();
	}
	
	public Number GetSingleInput(String arg)
	{
		while(keyboardGetStatus(""))
		{
			if(arg.matches("NextInt"))
			{
				return keyboard.nextInt();
			}
			else if(arg.matches("NextByte"))
			{
				return keyboard.nextByte();
			}
			else if(arg.matches("NextDouble"))
			{
				return keyboard.nextDouble();
			}
			else if(arg.matches("NextFloat"))
			{
				return keyboard.nextFloat();
			}
			else if(arg.matches("NextLong"))
			{
				return keyboard.nextLong();
			}
			else if(arg.matches("NextShort"))
			{
				return keyboard.nextShort();
			}
		}
		return (Number)Integer.parseInt(keyboard.next());
	}
	
	public String GetSingleInput()
	{
		while(keyboardGetStatus(""))
		{
				return keyboard.next();
		}
		return keyboard.next();
	}
	
	public Object[] GetMultipleInput(int num)
	{
		Object [] o = new Object[num];
		int i=0;
		while(keyboard.hasNext())
		{
			o[i] = keyboard.next();
			i++;
		}
		return o;
	}
	
	public Number MaxValue(Number... inputs)
	{
		Number max = 0;
		for(Number n:inputs)
		{
			max = max.longValue()-n.longValue()<0?n:max;
		}
		return max;
	}
	
	public Number MinValue(Number...inputs)
	{
		Number min = 0;
		for(Number n:inputs)
		{
			min = min.longValue()-n.longValue()>0?n:min;
		}
		return min;
	}
	
	public Number Reduce(Number...inputs)
	{
		Number sum = 0;
		for(Number n:inputs)
		{
			sum=sum.longValue()+n.longValue();
		}
		return sum;
	}
	
	public Number Reduce(ArrayList<Number> inputs)
	{
		Number sum = 0;
		for(Number n:inputs)
		{
			sum=sum.longValue()+n.longValue();
		}
		return sum;
	}
	
	public ArrayList<Number> ChopMultipleNumberInput(String InputLine)
	{

		ArrayList<Object> output = new ArrayList<Object>();
		int count = 0;
		if(InputLine.matches(","))
		{
			output.add(InputLine.substring(0, nextCharacterPos(InputLine,0,",")));
			while(nextCharacterPos(InputLine,1,",")!=-1)
			{
				output.add(InputLine.substring(nextCharacterPos(InputLine,0,",")+count+1, nextCharacterPos(InputLine,nextCharacterPos(InputLine,0,",")+count,",")));
				count += ((Number)output.get(count)).intValue();
			}
			output.add(InputLine.substring(count,InputLine.length()));
		}
		else if(InputLine.matches(" "))
		{
			output.add(InputLine.substring(0, nextCharacterPos(InputLine,0," ")));
			while(nextCharacterPos(InputLine,1," ")!=-1)
			{
				output.add(InputLine.substring(nextCharacterPos(InputLine,0," ")+count+1, nextCharacterPos(InputLine,nextCharacterPos(InputLine,0," ")+count," ")));
				System.out.println(InputLine.substring(nextCharacterPos(InputLine,0," ")+count+1, nextCharacterPos(InputLine,nextCharacterPos(InputLine,0," ")+count," ")));
				count += ((Number)output.get(count)).intValue();
			}
			output.add(InputLine.substring(count,InputLine.length()));
		}

			ArrayList<Number> outputNum = new ArrayList<Number>(output.size());
			for(int i =0;i<output.size();i++)
		{
			outputNum.set(i, (Number)output.get(i));
			
		}
			return outputNum;
	}
	
	public ArrayList<String> ChopMultipleStringInput(String InputLine)
	{

		ArrayList<String> output = new ArrayList<String>();
		int count = 0;
		if(InputLine.matches(","))
		{
			output.add(InputLine.substring(0, nextCharacterPos(InputLine,0,",")));
			while(nextCharacterPos(InputLine,1,",")!=-1)
			{
				output.add(InputLine.substring(nextCharacterPos(InputLine,0,",")+count+1, nextCharacterPos(InputLine,nextCharacterPos(InputLine,0,",")+count,",")));
				count += Integer.parseInt((output.get(count)));
			}
			output.add(InputLine.substring(count,InputLine.length()));
		}
		else if(InputLine.matches(" "))
		{
			output.add(InputLine.substring(0, nextCharacterPos(InputLine,0," ")));
			while(nextCharacterPos(InputLine,1," ")!=-1)
			{
				output.add(InputLine.substring(nextCharacterPos(InputLine,0," ")+count+1, nextCharacterPos(InputLine,nextCharacterPos(InputLine,0," ")+count," ")));
				count += Integer.parseInt((output.get(count)));
			}
			output.add(InputLine.substring(count,InputLine.length()));
		}

			return output;
	}
	
	public int nextCharacterPos(String s,int index,String find)
	{
		for(int count = index;count<=s.length()-index-1;count++)
		{
			if(Character.toString(s.charAt(count))==find)
			{
				return count;
			}
			else
				continue;
		}
		return -1;
	}
}
