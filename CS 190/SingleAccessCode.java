/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/01/21
 * Last Updated: 10/01/21
 *
 * Compilation: javac SingleAccessCode.java
 * Execution: java SingleAccessCode
 *
 * Description:
 * A program that generates a code where each field in a code consists of five randomly generated, upper case, alphabetic characters 
 * and each individual code consists of five such fields separated by a dash. There are no dash at the beginning or the end of the code.
 * 
 * Sample Output:
 * Random Access Code:
 * YIBOR-LNUEL-OFWIN-IJSNB-UXBEV
 -------------------------------------------------*/
import java.util.Scanner;
public class SingleAccessCode{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Random Access Code: ");
		String access = "";

		access += (char)('A'+ Math.random()*26); // generates random uppercase alphabetical characters
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access+= '-';
		access += (char)('A'+ Math.random()*26); // generates random uppercase alphabetical characters
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access+= '-';
		access += (char)('A'+ Math.random()*26); // generates random uppercase alphabetical characters
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access+= '-';
		access += (char)('A'+ Math.random()*26); // generates random uppercase alphabetical characters
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += '-';
		access += (char)('A'+ Math.random()*26); // generates random uppercase alphabetical characters
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		access += (char)('A'+ Math.random()*26);
		System.out.print(access);
	}
}



