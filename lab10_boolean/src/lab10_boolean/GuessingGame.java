package lab10_boolean;
import SUPPORT.* ;
public class GuessingGame 
{
	Support SU = new Support();
	int PlayerInput=0;
	int target = 0;
	int number = 0 ;
	int wrong = 0;
	String PlayerCommand = "";
	int totalNum = 1;
	public void Game() throws NullPointerException
	{
		
		System.out.print("Guessing Game - how many numbers? ");
		number = (int)SU.GetSingleInput("int");
		target = SU.ReturnRandom(1,number);
		System.out.println("Enter a number between 1 and "+number);
		while(true)
		{
			PlayerInput = (int)SU.GetSingleInput("int");
			if(PlayerInput!=target)
			{
				if(PlayerInput<1||PlayerInput>number)
				{
					System.out.println("Number out of range!");
				}
				totalNum++;
				wrong+=1;
				System.out.println(wrong);
				System.out.println(totalNum);
				System.out.println("Enter a number between 1 and "+number);
			}
			else if(totalNum==0)
			{
				System.out.println("You're So AMAZING!!!It Takes Only 1 GUESS???");
				System.out.println("Do you want to play again? ");
				PlayerCommand = SU.GetSingleInput("").toString();
				if(PlayerCommand.matches("n|N"))
				{
					throw new NullPointerException ("PlayerDontWantsToPlay");
				}
				else if(PlayerCommand.matches("y|Y"))
				{
					break;
				}
				else
					throw new NullPointerException ("PlayerDontWantsToPlay");
					
			}
			else if(PlayerInput==target)
			{
				System.out.println("It took "+totalNum+" guesses to guess "+target);
				System.out.println("You guessed wrong "+((float)wrong/(float)totalNum*100)+"% of the time.");
				System.out.println("Do you want to play again? ");
				PlayerCommand = SU.GetSingleInput("").toString();
				if(PlayerCommand.matches("n|N"))
				{
					throw new NullPointerException ("PlayerDontWantsToPlay");
				}
				else if(PlayerCommand.matches("y|Y"))
				{
					break;
				}
				else
					throw new NullPointerException ("PlayerDontWantsToPlay");
					
			}
		}
	}
}
