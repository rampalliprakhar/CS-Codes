/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/08/21
 * Last Updated: 10/08/21
 *
 * Compilation: javac HighestScore.java
 * Execution: java HighestScore
 *
 * Description:
 * A program that asks the user to enter the number of students and each student’s name and score, and displays the name of the student with the highest score.
 * 
 * Sample Output:
 * Enter the number of students: 9
 * Enter a student name: James
 * Enter a student score: 97
 * Enter a student name: Peter
 * Enter a student score: 90
 * Enter a student name: Simon
 * Enter a student score: 85
 * Enter a student name: Bob
 * Enter a student score: 99
 * Enter a student name: Alice
 * Enter a student score: 75
 * Enter a student name: John
 * Enter a student score: 80
 * Enter a student name: Doe
 * Enter a student score: 94
 * Enter a student name: Ryan
 * Enter a student score: 86
 * Enter a student name: Dylan
 * Enter a student score: 70
 * Top student Bob's score is 99.0
 -------------------------------------------------*/
import java.util.*;
public class HighestScore {
	public static void main(String[] args) {
    		Scanner input = new Scanner(System.in);

	    	// Prompt the user to enter the number of students
    		System.out.print("Enter the number of students: ");
    		int numOfStudents = input.nextInt();

	    	System.out.print("Enter a student name: ");
    		String student1 = input.next();
    		System.out.print("Enter a student score: ");
    		double score1 = input.nextDouble(); // takes the score in double type
    		int i = 0; 			    
    		while (i < numOfStudents - 1) {
      			System.out.print("Enter a student name: ");
      			String student = input.next();

      			System.out.print("Enter a student score: ");
      			double score = input.nextDouble();

      			if (score > score1) { 	    // checks whether the current score is greater than the previous input score
        			student1 = student;
        			score1 = score;
			}
      			i++; 			   //  increments value
   	 	}

		System.out.println("Top student " + student1 + "'s score is " + score1);
	}
}