/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/20/21
 * Last Updated: 10/20/21
 *
 * Compilation: javac Occurrences.java
 * Execution: java Occurrences
 *
 * Description:
 * A program that counts the occurrences of characters in a string.
 * 
 * Sample Output:
 * Enter a string:
 * Encyclopedia
 * Enter a character:
 * c
 * the number of c in the string is 2
 * 
 -------------------------------------------------*/
import java.util.Scanner;
public class Occurrences{
	public static void main(String[]args){
		//Exercise 6.23//
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		System.out.println("Enter a character: ");
		char ch = input.nextLine().charAt(0);
		System.out.println("the number of " + ch + " in the string is "+ count(s, ch));
	}
	public static int count(String str, char a){ // method that counts the occurrences of a character in a string
		int count = 0;
		for (int i = 0; i < str.length(); i++){
			if (str.charAt(i) == a){
				count++;
      			}
		}
		return count;	
	}
}