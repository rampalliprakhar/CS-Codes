/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/03/21
 * Last Updated: 09/03/21
 *
 * Compilation: javac PlaceValue.java
 * Execution: java PlaceValue
 *
 * Description:
 * A program that identifies the place values at each position of an integer having a size between zero and ten-thousand.
 *
 * Sample Output:
 * Please enter an integer between 0 and 10,000: 54312
 * You entered 54312
 * Ones = 2
 * Tens = 1
 * Hundreds = 3
 * Thousands = 4
 * Ten Thousands = 5
 -------------------------------------------------*/
import java.util.Scanner;
public class PlaceValue {
	public static void main (String [] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer between 0 and 10,000: ");
		int num = input.nextInt(); // num takes an input value and splits the digits based on the conversion factor
		System.out.println("You entered " + num);
		
		System.out.println("Ones = " + num % 10);
		
		System.out.println("Tens = " + (num / 10) % 10);
		
		System.out.println("Hundreds = " + (num / 100) % 10 );
		
		System.out.println("Thousands = " + (num / 1000) % 10);
		
		System.out.println("Ten Thousands = " + (num / 10000) % 10);
	}
}