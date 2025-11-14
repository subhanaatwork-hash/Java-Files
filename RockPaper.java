//Game: SCISSORS, ROCK, PAPER.

import java.util.*;
	public class RockPaper{
		public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		//Computer choice
		
		int computerChoice;
		computerChoice = (int)( Math.random()*3);

		//User choice

		System.out.println("Enter a number between 0-2 as 0= Rock, 1= Paper and 2=Scissors");
		int userInput = sc.nextInt();

		if(userInput == computerChoice){
		System.out.println("It is a draw.");
		}
		else if ((userInput == 0 && computerChoice == 2) || (userInput == 1 && computerChoice == 0) || (userInput == 2  && computerChoice == 1) )
				{System.out.println("YOU WIN");
		}
		else
				{System.out.println("COMPUTER WINS");
		}

		sc.close();
}
}
		
		
		
		
		