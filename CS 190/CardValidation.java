/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/22/21
 * Last Updated: 10/22/21
 *
 * Compilation: javac CardValidation.java
 * Execution: java CardValidation
 *
 * Description:
 * A program that reads in a 14-digit credit card number from the user and validates the card
 * number for correct length (fourteen), character type (no alphabetic characters), and performs the
 * error detection algorithm.
 * 
 * Sample Output:
 * Enter 14-digit card number: 1 2 3 4 5 6 4 3 2 1 7 7 6 5 4
 * Length incorrect
 * Characters incorrect
 * Odd sum  = 66
 * Even sum  = -224
 * Card number invalid 
 * 
 -------------------------------------------------*/

import java.util.Scanner;
public class CardValidation{ 
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 14-digit card number: ");
		String card = input.nextLine(); // takes 14-digit input
			
		if(Length(card)){ // checks length of card number
			System.out.println("Length correct"); // if length 14, then correct
		}
		else{
			System.out.println("Length incorrect");
		}
		if(characters(card)){
			System.out.println("Characters correct");
		}
		else{
			System.out.println("Characters incorrect");
		}
		if(Cardnumber(card)){
			System.out.print("Card number valid");
		} 
		else{
			System.out.print("Card number invalid");
		}
	}
	public static boolean Length(String card){ // a boolean method that checks whether length of card is 14-digits or not
		return card.length()==14;
	}
	public static boolean characters(String card){ // a boolean method that checks whether there are characters except numerical digits or not
		int digit=0;
		for(int i = 0; i < card.length(); i++){
			digit = (int)(card.charAt(i))-48;
			if(digit < 0 || digit > 9){
				return false;
			}
		}
		return true;
	}
	public static boolean Cardnumber(String card){ // a boolean method that checks whether the sum of digits of card number is a multiple of 10
		int oddsum=0;
		int evensum=0;
		for(int i = card.length()-1; i>=0; i--){
			if((i+1)%2==0){
				evensum+= card.charAt(i)-48;
			}
			else{
				int digit=card.charAt(i)-48;
				digit = digit*2;
				if(digit>9){
					digit= digit-9;
				}
				oddsum+= digit;
			}
		}
		System.out.println("Odd sum " + " = " + oddsum);
		System.out.println("Even sum " + " = " + evensum);
		return ((oddsum + evensum)%10==0);
	}
}

