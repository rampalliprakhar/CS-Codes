/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/24/21
 * Last Updated: 09/24/21
 *
 * Compilation: javac StudentGrades.java
 * Execution: java StudentGrades
 *
 * Description:
 * A program that generates a random integer in the range 60 to 99 and then prints that integer and the letter grade that would correspond to that score on a test,
 * using a 10-point scale with a “+” for scores that end with 8 or 9 and a “-“ for scores that end with 0 or 1
 * Sample Output:
 * Score 99 Grade A+
 -------------------------------------------------*/
import java.util.Scanner;
public class StudentGrades{	
	public static void main(String[]args){
		int score = (int)(Math.random()*40) + 60; // generates scores from 0 - 100
		System.out.print("Score " + score + " Grade ");
		if(score >= 98){
			System.out.println("A+");
		}
		else if(score >= 92){
			System.out.println("A");
		}
		else if(score >= 90){
			System.out.println("A-");
		}
		else if(score >= 88){
			System.out.println("B+");
		}
		else if(score >= 82){
			System.out.println("B");
		}
		else if(score >= 80){
			System.out.println("B-");
		}
		else if(score >= 78){
			System.out.println("C+");
		}
		else if(score >= 72){
			System.out.println("C");
		}
		else if(score >= 70){
			System.out.println("C-");
		}
		else if(score >= 68){
			System.out.println("D+");
		}
		else if(score >= 62){
			System.out.println("D");
		}
		else{
			System.out.println("D-");
		}
	}
}