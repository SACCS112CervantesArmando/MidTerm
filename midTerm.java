import java.util.Scanner;

public class midTerm {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		int toss;
		
				System.out.print("Let's play a dice guessing game, enter 1 to toss the dice, or 2 to quit, then guess whether your toss came up even or odd! ");
					toss=input.nextInt();
					
					if (toss == 1)
						
					{
						String dieGuess;
						
						System.out.print("The dice are rolled, do you think the toss came up even or odd? ");
							dieGuess= input.next();
							
						   int die1 = 1 + (int)(Math.random()*6);
						   int die2 = 1 + (int)(Math.random()*6);
						   int sum= die1 + die2;
		
							if ((int[] sum= new int[6] {2,4,6,8,10,12})&&(dieGuess.equalsIgnoreCase("even")))
							{
						
								System.out.println("You guessed correct!");
							}
				
							else
								System.out.println("You gussed wrong!");
					}
					
					else
						System.out.print("Sorry to see you go.");
					
				
		
	}
}
