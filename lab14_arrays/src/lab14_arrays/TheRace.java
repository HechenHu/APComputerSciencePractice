package lab14_arrays;
import SUPPORT.*;
import java.util.*;
public class TheRace 
{
	Support SU = new Support();
	ArrayList<Integer> RaceTrack = new ArrayList<Integer>();

	int PlayerOneLapCount=0;
	int PlayerTwoLapCount=0;
	public void Race()
	{	
		for(int i =0;i<19;i++)
		{
			RaceTrack.add(0);
		}
		
		int P1Location = SU.ReturnRandom(17);
		int P2Location = SU.ReturnRandom(17);
		while(PlayerOneLapCount!=5&&PlayerTwoLapCount!=5)
		{
			for(int i = 0;i<19;i++)
			{
				RaceTrack.set(i, 0);
			}
			P1Movement:
			{
			P1Location+=(P1Location>18?-1*SU.ReturnRandom(17):SU.ReturnRandom(17));
			if(P1Location==P2Location)
			{
				P2Location=0;
			}
			if(P1Location>18)
			{
				PlayerOneLapCount++;
				P1Location=18-(P1Location-18);
			}
			if(P1Location<0)
			{
				P1Location=0-P1Location;
			}
			
			}
			P2Movement:
			{
				P2Location+=(P2Location>18?-1*SU.ReturnRandom(17):SU.ReturnRandom(17));
				if(P1Location==P2Location)
				{
					P1Location=0;
				}
				if(P2Location>18)
				{
					PlayerTwoLapCount++;
					P2Location=18-(P2Location-18);
				}
				if(P2Location<0)
				{
					P2Location=-P2Location;
				}

			}
		
			RaceTrack.set(P1Location, 1);
			RaceTrack.set(P2Location, 2);
			System.out.println(PlayerOneLapCount+"  "+PlayerTwoLapCount);
			System.out.println(RaceTrack);
		}
		System.out.println(PlayerOneLapCount==5?"PlayerOne win!!":"PlayerTwo win!!");
	}
}
