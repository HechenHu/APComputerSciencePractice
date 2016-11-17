package lab09_while_dowhile;

public class LetterRemover 
{
	public void PrintResult(String input,char RemoveTarget)
	{
		System.out.println(input+" - Letter To Remove -"+RemoveTarget+"\n"+ReturnResult(input,RemoveTarget));
	}
	
	public String ReturnResult(String input,char RemoveTarget)
	{
		int i=0;
		while(input.matches(Character.toString(RemoveTarget)));
		{
			for(i=0;i<input.length();)
			{
				if(input.charAt(i)==RemoveTarget)
				{
					if(input.charAt(0)==RemoveTarget)
					{
						input=input.substring(1, input.length());
					}
					else
					{
						input=input.substring(0,i)+input.substring(i+1, input.length());
					}
				}
				else
					i++;
			}
		}
		
		return input;
	}
}
