import java.util.Scanner;

public class RevisedMidTerm {

	public static void main(String[] args)

	{
		
		Scanner input = new Scanner(System.in);
		int toss;
		
				System.out.print("Let's play a dice guessing game, enter 1 to toss the dice, or 2 to quit, then guess whether your toss came up even or odd! ");
					toss= input.nextInt();
					
					if (toss == 1)
						
					   {    
							String dieGuess;
						
							System.out.print("The dice are rolled, do you think the toss came up even or odd? ");
							dieGuess= input.next();
							
							
							int die1 = 1 + (int)(Math.random()*6);
						    int die2 = 1 + (int)(Math.random()*6);
						    
						    int sum= die1 +die2;
								
								
							if (sum % 2 == 0 && dieGuess.equalsIgnoreCase("odd"))
								{
									System.out.printf("%s%d%s","The dice roll is ",sum,", You guessed wrong!");
								}
							
							if (sum % 2 != 0 && dieGuess.equalsIgnoreCase("even"))
								{
								System.out.printf("%s%d%s","The dice roll is ",sum,", You guessed wrong!");
								}
							else 

							    if (sum % 2 == 0 && dieGuess.equalsIgnoreCase("even"))	
									{
										System.out.printf("%s%d%s","The dice roll is ",sum,", You guessed correct!");
									}
						 }
					
					else
						
						System.out.print("Sorry to see you go.");
					
					
							
						
					  
					
				
		
	}
}