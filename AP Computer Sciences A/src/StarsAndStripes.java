import java.util.Random;
public class StarsAndStripes 
{
	   Random randomGenerator = new Random();
	   public StarsAndStripes()
	   {
	      System.out.println("StarsAndStripes");
	      printBlankLines(2);
	   }

	   public void printStars(int number)
	   {
		   int count;
		   for(count=1;count<=number;count++)
		   {
			   System.out.println("********************\n");
		   }
	   }

	   public void printDashes(int number)
	   {
		   int count;
		   for(count=1;count<=number;count++)
		   {
			    System.out.println("--------------------\n");
		   }  
	   }

	   public void printBlankLines(int number)
	   {   
		   int count;
		   for(count=1;count<=number;count++)
		   {
			   System.out.println("\n");
		   }
	   }
	   public void printASmallBox()
	   {	
		   int RandomNum = randomGenerator.nextInt(50);
		   int RandomPattern;
		   int count;
		   printDashes(1);
		   for(count = 0;count<=RandomNum;count++)
		   {
			   RandomPattern = randomGenerator.nextInt(2);
			   switch(RandomPattern)
			   {
			   case 0:printStars(1);break;
			   case 1:printDashes(1);break;
			   case 2:printBlankLines(1);break;
			   }
		   }
		   printDashes(1);
	   }
	 
	   public void printABigBox()
	   { 	
		   int RandomNum = randomGenerator.nextInt(500);
		   int RandomPattern;
		   int count;
		   printDashes(1);
		   for(count = 0;count<=RandomNum;count++)
		   {
			   RandomPattern = randomGenerator.nextInt(2);
			   switch(RandomPattern)
			   {
			   case 0:printStars(1);break;
			   case 1:printDashes(1);break;
			   case 2:printBlankLines(1);break;
			   }
		   }
		   printDashes(1);
	   }   
}
