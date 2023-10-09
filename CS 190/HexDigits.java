/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/01/21
 * Last Updated: 10/01/21
 *
 * Compilation: javac HexDigits.java
 * Execution: java HexDigits
 *
 * Description:
 * A program that converts hexadecimal digits to binary digits.
 * 
 * Sample Output:
 * Enter a hex digit: 7
 * The binary value is: 111
 -------------------------------------------------*/
import java.util.Scanner;
public class HexDigits{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String hex = input.nextLine();
		if(hex.compareTo("9")>0) hex = hex.toUpperCase();
		int binary = 0;

		switch(hex){
			case "0": break;
			case "1": binary = 1; break;
			case "2": binary = 10; break;
			case "3": binary = 11; break;
			case "4": binary = 100; break;
			case "5": binary = 101; break;
			case "6": binary = 110; break;
			case "7": binary = 111; break;
			case "8": binary = 1000; break;
			case "9": binary = 1001; break;
			case "A": binary = 1010; break;
			case "B": binary = 1011; break;
			case "C": binary = 1100; break;
			case "D": binary = 1101; break;
			case "E": binary = 1110; break;
			case "F": binary = 1111; break;
			default: binary = 2;
		}
		if(binary==2){
			System.out.println("Invalid Entry!");
		}
		else{
			System.out.println("The binary value is: " +binary);
		}
	}
}