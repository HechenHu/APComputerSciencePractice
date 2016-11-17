package lab10_boolean;
import java.util.*;
import SUPPORT.*;
public class RockPaperScissors 
{
	Support SU = new Support();
	Map<String, String>  RPS = new HashMap<String, String>();
	Map<String, String>  Output = new HashMap<String, String>();
	Map<String, String>  WithDraw = new HashMap<String, String>();
	public RockPaperScissors ()
	{
		WithDraw.put("R", "R");
		WithDraw.put("P", "P");
		WithDraw.put("S", "S");
		RPS.put("R","S");
		RPS.put("S","P");
		RPS.put("P","R");
		Output.put("R","<<Rock Breaks Scissors>>!");
		Output.put("P","<<Paper Covers Rock>>!");
		Output.put("S","<<Scissors Cuts Paper>>!");
	}

	public void Game()
	{
		String PlayerInput="";
		do
		{
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]::");
			PlayerInput=SU.GetSingleInput("string").toString();
			System.out.println("\n"+"Player Has "+PlayerInput);
			System.out.print("Computer Has ");
			ResultEvaluate(PlayerInput);
			PlayerInput=SU.GetSingleInput("string").toString();
			if(PlayerInput.matches("y|Y"));
			continue;
		}
		while(!PlayerInput.matches("n|N"));

	}
	public void ResultEvaluate(String PlayerInput)
	{
		String ComputerSelection = "";
		switch (SU.ReturnRandom(2))
		{
		case 0 :ComputerSelection = "R";break;
		case 1 :ComputerSelection = "P";break;
		case 2 :ComputerSelection = "S";break;
		}
		System.out.print(ComputerSelection+"\n");
		if(WithDraw.get(PlayerInput)==ComputerSelection)
		{
			System.out.println("!Draw Game!");
			System.out.println("Do you want to play again? ");
		}
		else if(RPS.get(PlayerInput)==ComputerSelection)
		{
			System.out.println("!Player wins "+Output.get(PlayerInput));
			System.out.println("Do you want to play again? ");
		}
		else if(RPS.get(PlayerInput)!=ComputerSelection)
		{
			System.out.println("!Computer wins"+Output.get(ComputerSelection));
			System.out.println("Do you want to play again? ");
		}
	}
}
