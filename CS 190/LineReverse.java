/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/15/21
 * Last Updated: 10/15/21
 *
 * Compilation: javac LineReverse.java
 * Execution: java LineReverse
 *
 * Description:
 * A program that prompts a user to enter a line of text and then reverses the text in two ways:
 * a. Letter by letter
 * b. Word by word
 * 
 * Sample Output:
 * Please enter a line of text: Writing tablet with ruler
 * Writing tablet with ruler
 * Reversed - Letter by letter...
 * relur htiw telbat gnitirW
 * Reversed - Word by word...
 * ruler with tablet Writing
 * Press '1' to continue, '0' to exit game
 * 0
 -------------------------------------------------*/
import java.util.Scanner;
public class LineReverse{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String let;
		System.out.print("Please enter a line of text: ");
		while(true){
			let = input.nextLine();
			System.out.println(let);
			String reversed = "";
			for(int i = let.length()-1; i>=0; i--){ // reverses the string letter by letter
				reversed+= let.charAt(i);
			}
			System.out.println("Reversed - Letter by letter...\n" + reversed);
			reversed += ' ';
			System.out.println("Reversed - Word by word...");
			while(reversed.length()!=0){ // checks whether length of reversed string is not 0
				int space = reversed.indexOf(' ');
				String word = reversed.substring(0,space);
				for(int i =word.length()-1; i>=0; i--){ // reverses string word by word
					System.out.print(word.charAt(i));
				}
				System.out.print(' ');
				reversed = reversed.substring(space+1);
			}
			System.out.println();
			System.out.println("Press '1' to continue, '0' to exit game ");
			let = input.nextLine();

			if(let.charAt(0) == '0'){
				break;
			}
   			else{
	   			System.out.println("Play again?");
   			}
   			System.out.println("Thanks for playing!");
		}
	}
}
