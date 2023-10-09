/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/24/21
 * Last Updated: 09/24/21
 *
 * Compilation: javac FederalIncomeTax.java
 * Execution: java FederalIncomeTax
 *
 * Description:
 * A program that allows a user to enter their annual income, rounded to the nearest dollar (no cents), for the year 2018 and computes their tax due.
 * Sample Output:
 * Please enter your annual income:
 * 7250
 * The tax is: 725.0
 -------------------------------------------------*/
import java.util.Scanner;
public class FederalIncomeTax{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your annual income: ");
		double annual = input.nextDouble(); // annual takes the input in double type
		double x; // calculates tax based on the given range of the if - loop
		if(annual > 0 && annual <= 9525){
			x = annual * 0.10;
			System.out.println("The tax is: " + x);
		}
		else if(annual > 9525 && annual <= 38700){
			x = 952.50 + (annual - 9525) * 0.12;
			System.out.println("The tax is: " + x);
		}
		else if(annual > 38700 && annual <= 82500){
			x = 4453.50 + (annual - 38700) * 0.22;
			System.out.println("The tax is: " + x);
		}
		else if(annual > 82500 && annual <= 157500){
			x = 14089.50 + (annual - 82500) * 0.24;
			System.out.println("The tax is: " + x);
		}
		else if(annual > 157500 && annual <= 2000000){
			x = 32089.50 + (annual - 157500) * 0.32;
			System.out.println("The tax is: " + x);
		}
		else if(annual > 200000 && annual <= 500000){
			x = 45689.50 + (annual - 200000) * 0.35;
			System.out.println("The tax is: " + x);
		}
		else{
			x = 150689.50 + (annual - 500000) * 0.37;
			System.out.println("The tax is: " + x);
		}
	}
}


