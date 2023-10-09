/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/24/21
 * Last Updated: 09/24/21
 *
 * Compilation: javac PalindromeInt.java
 * Execution: java PalindromeInt
 *
 * Description:
 * A program that checks whether a three digit integer number is a palindrome (first and last digits are the same, rare case - first, middle, and last are the same).
 * Sample Output:
 * Enter a three-digit integer:
 * 322
 * 322 is not a palindrome
 * Enter a three-digit integer:
 * 555
 * 555 is a palindrome
 -------------------------------------------------*/
import java.util.Scanner;
public class PalindromeInt{
	public static void main(String[]args){
		//implemented by Prakhar Rampalli//
		System.out.println("Enter a three-digit integer: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int a, b, original; // three variables where a and b splits the first and last digit of the original number given as the input
		
		if(num>=100 && num<=999){ // number is greater than or equal to 100 and less than or equal to 999
			//first digit number//
			a = num / 100;
			b = num % 10; 
			original = num;
			if(a==b){
				System.out.println(num +" is a palindrome");
			}
			else{
				System.out.println(num + " is not a palindrome");
			}
		}
		else{
			System.out.println("The number is not a three digit number");
		}
	}
}