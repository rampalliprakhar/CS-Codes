/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/17/21
 * Last Updated: 09/17/21
 *
 * Compilation: javac RockPaperScissors.java
 * Execution: java RockPaperScissors
 *
 * Description:
 * A program which plays Rock-Paper-Scissors game, the program prompt the user to select their object by entering ‘R’ for rock, ‘P’ for paper, or ‘S’ for scissors.
 * The computer will randomly select one of these three objects to play. The program will then report the winner or a tie.
 * 
 * Sample Output:
 * Select your object to play
 * Enter 'R' for rock
 * Enter 'P' for paper
 * Enter 'S' for scissors
 * Choose your object to play: r
 * You selected  R/r
 * Computer selected s
 * The winner is: user
 -------------------------------------------------*/
import java.util.Scanner;
public class RockPaperScissors{
	public static void main(String[]args){
		System.out.println("Select your object to play");
		System.out.println("Enter 'R' for rock");
		System.out.println("Enter 'P' for paper");
		System.out.println("Enter 'S' for scissors");
		System.out.print("Choose your object to play: ");
		Scanner input = new Scanner(System.in);
		int User, Comp;
		User = input.next().charAt(0);
		Comp =(int)(Math.random()*10);       // generates integer between 0 - 9
		char ch;
		if(Comp >= 0 && Comp <= 3){          // if computer generates integer greater than or equal to 0 or less than or equal to 3
			ch= 'r';                     // computer selects r
		}
		else if(Comp > 3 && Comp <= 7) {     // if computer generates integer greater than or equal to 0 or less than or equal to 3           
			ch= 'p';                     // computer selects p
		}
		else {
			ch= 's'; 		     // computer selects s
		}
			
		if(User == 82 || User == 114){       // checks to see if the user inputs R or r
			System.out.println("You selected  R/r");
			System.out.println("Computer selected "+ch);
				if(ch=='r'){
					System.out.println("The winner is: tie");
				}
				else if(ch=='p') {
					System.out.println("The winner is: computer");
				}
				else if(ch=='s') {
					System.out.println("The winner is: user");
				}
		}
		
		
      		else if (User == 80 || User == 112) {    // checks to see if the user inputs P or p
      			System.out.println("You selected  P/p");
			System.out.println("Computer selected "+ch);
			if(ch=='r'){
				System.out.println("The winner is: user");
			}
			else if(ch=='p') {
				System.out.println("The winner is: tie");
			}
			else if(ch=='s') {
				System.out.println("The winner is: computer");
			}
      		}

      		else if (User == 83 || User == 115) {    // checks to see if the user inputs S or s
      			System.out.println("You selected  S/s");
			System.out.println("Computer selected "+ch);
			if(ch=='r'){
				System.out.println("The winner is: computer");
			}
			else if(ch=='p') {
				System.out.println("The winner is: user");
			}
			else if(ch=='s') {
				System.out.println("The winner is: tie");
			}
      		}
      		else
      		{
      			System.out.println("Invalid Input"); // if user inputs characters other than r, p, or s
      		}
      
	}
}