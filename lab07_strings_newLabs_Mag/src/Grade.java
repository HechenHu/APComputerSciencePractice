
public class Grade 
{
	public void printResult(int Score)
	{
		char rank;
		if(Score>=90)
		{
			rank = 'A';
		}
		else if(Score>=80)
		{
			rank = 'B';
		}
		else if(Score>=75)
		{
			rank = 'C';
		}
		else if(Score>=70)
		{
			rank = 'D';
		}
		else if(Score<70)
		{
			rank = 'F';
		}
		else{
			rank = 'N';
		}
		System.out.println(Score+" is "+rank);
	}

}
