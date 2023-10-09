/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/10/21
 * Last Updated: 09/10/21
 *
 * Compilation: javac HeronsFormula.java
 * Execution: java HeronsFormula
 *
 * Description:
 * A program that prompts a user to enter the coordinates of the triangle vertices and then computes the area of a triangle.
 * Sample Output:
 * Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: 1 2 7 4 6 7
 * The area of the triangle is 10.0
 -------------------------------------------------*/
import java.util.Scanner;
public class HeronsFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
            	System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3:");
            	
		double x1 = input.nextDouble();
            	double y1 = input.nextDouble();
            	double x2 = input.nextDouble();
            	double y2 = input.nextDouble();
            	double x3 = input.nextDouble();
            	double y3 = input.nextDouble();

            	double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)); // calculates length of side A
            	double b = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2)); // calculates length of side B
            	double c = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1)); // calculates length of side C
            	double s = (a + b + c)/ 2; 				 // calculate the perimeter of a triangle
            	double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));		 // calculates the area of a triangle using Herons formula
	        System.out.println("The area of the triangle is " + area); // prints the calculated area
        }
}
    