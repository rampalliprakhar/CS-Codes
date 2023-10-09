/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/29/21
 * Last Updated: 10/29/21
 *
 * Compilation: javac MetersAndFeet.java
 * Execution: java MetersAndFeet
 *
 * Description:
 * A program which implements Meters - Feet, and Inches - Centimeters Conversion.
 * 
 * Sample Output:
 *
 * Feet      Meters      |    Meters      Feet       |       Inches         Centimeters
 *  1.0       0.305      |     20.0      65.400      |        10.0             3.937
 *  2.0       0.610      |     25.0      81.750      |        20.0             7.874
 *  3.0       0.915      |     30.0      98.100      |        30.0            11.811
 *  4.0       1.220      |     35.0     114.450      |        40.0            15.748
 *  5.0       1.525      |     40.0     130.800      |        50.0            19.685
 *  6.0       1.830      |     45.0     147.150      |        60.0            23.622
 *  7.0       2.135      |     50.0     163.500      |        70.0            27.559
 *  8.0       2.440      |     55.0     179.850      |        80.0            31.496
 *  9.0       2.745      |     60.0     196.200      |        90.0            35.433
 * 10.0       3.050      |     65.0     212.550      |       100.0            39.370
 -------------------------------------------------*/
import java.util.Scanner;
public class MetersAndFeet{
	public static void main(String[] args){
 		System.out.printf("\n%-10s%-12s|%10s%10s       |%13s%20s\n","Feet","Meters","Meters","Feet","Inches","Centimeters");
  		for(int i = 1,j = 20,k = 10; i <= 10; i++ , j += 5, k += 10)
			System.out.printf("%4.1f     %7.3f      |     %4.1f     %7.3f      |     %7.1f     %13.3f\n", (double)i , footToMeter((double)i) , (double)j ,meterToFoot((double)j), 			(double)k , inchesToCentimeters((double)k));
		} 
 		public static double footToMeter(double foot){ // method that converts feet to meters
  			double meters=0.305*foot;
  			return meters;
  		}
 		public static double meterToFoot(double meter){ // method that converts meters to feet
  			double feet=3.270*meter;
  			return feet;
  		}
 		public static double inchesToCentimeters(double inch){ // method that converts inches to centimeters
 	 		double centimeters=0.3937008*inch;
 	 		return centimeters; 
 	 	}
	}