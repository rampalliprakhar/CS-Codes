/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 10/29/21
 * Last Updated: 10/29/21
 *
 * Compilation: javac AreaMenu.java
 * Execution: java AreaMenu
 *
 * Description:
 * A program which computes area of circle, pentagon, and regular polygon.
 * 
 * Sample Output:
 * Select an option
 *  1. Circle
 *  2. Pentagon
 *  3. Regular Polygon
 *  4. Exit
 *  1
 *  You selected option 1
 *
 *  Enter the radius: 3
 *  The area of the circle is 28.274 
 * 
 -------------------------------------------------*/

import java.util.Scanner;
public class AreaMenu{
 public static void main(String[] args){
  while(true){ // while the function is true
   int option = menu();
   switch(option){
    case 1:   case1();
		break;
    case 2:   case2();
		break;
    case 3:   case3();
		break;
    case 4:   System.exit(0);        
    }
   }
  }

 static int menu(){ // creates a method for menu
  Scanner input = new Scanner(System.in);
  System.out.println("Select an option");
  System.out.println("1. Circle");
  System.out.println("2. Pentagon");
  System.out.println("3. Regular Polygon");
  System.out.println("4. Exit");
  return input.nextInt();
 }

 static void case1(){ // creates cases for each option
   Scanner input = new Scanner(System.in);
   System.out.println("You selected option 1\n");
   System.out.print("Enter the radius: ");
   int radius = input.nextInt();
   double area = Math.PI*(radius*radius); // area of circle
   System.out.printf("The area of the circle is %4.3f\n ", area); // formats the answer
 }
 static void case2(){
    Scanner input = new Scanner(System.in);
   System.out.println("You selected option 2\n");
   System.out.print("Enter the length of a side: ");
   double side =input.nextDouble();
   double area = (5*side*side)/(4*Math.tan(Math.PI/5)); // area of pentagon
   System.out.printf("The area of pentagon is %4.3f\n ", area);
 }
 static void case3(){
    Scanner input = new Scanner(System.in);
   System.out.println("You selected option 3\n");
   System.out.print("Enter the number of sides: ");
   int numside = input.nextInt();
   System.out.print("Enter length of a side: ");
   double side = input.nextDouble();
   double area= numside*(side*side)/(4*Math.tan(Math.PI/numside)); // area of regular polygon
   System.out.printf("The area of a polygon is %4.3f\n ", area);
 }
}