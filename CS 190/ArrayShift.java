/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 11/05/21
 * Last Updated: 11/05/21
 *
 * Compilation: javac ArrayShift.java
 * Execution: java ArrayShift
 *
 * Description:
 * A program which applies several shifting/swapping operations to the elements of a one-dimensional array..
 * 
 * Sample Output:
 * 26 81 44 77 93 41 44 84 59 62
 * Enter l to shift left
 * Enter r to shift right
 * Enter p to shift pairs
 * Enter e to shift exit
 * l
 * Enter l to shift left
 * 81 44 77 93 41 44 84 59 62 26
 -------------------------------------------------*/
import java.util.Scanner;
	public class ArrayShift{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);
			int[] list = randInts(10);
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
			}
			while(true){
			   String option = menu();
			   switch(option){
			    case "l":   shiftLeft(list);
					break;
			    case "r":   shiftRight(list);
					break;
			    case "p":   swapPairs(list);
					break;
			    case "e":   System.exit(0);    
			    }
			}
		}
		static String menu(){
			Scanner input = new Scanner(System.in);
			System.out.println("\nEnter l to shift left");
			System.out.println("Enter r to shift right");
			System.out.println("Enter p to shift pairs");
			System.out.println("Enter e to shift exit");
			return input.nextLine();
		}
		public static int[] randInts(int n){ // method that generates random integers
			int[] list = new int[10];
	  		for(int i=0; i<list.length; i++){
	  			list[i] = (int)(Math.random()*100); // generates random numbers
	  		}
			return list;
		}
		public static void shiftLeft(int[] yourArray){ // method that shifts array to the left by 1 element
			if(true){
				System.out.println("Enter l to shift left");
				int temp = yourArray[0];
				for(int i =1; i<yourArray.length; i++){
					yourArray[i-1] = yourArray[i];
				}
				yourArray[yourArray.length-1]= temp;
				for (int i = 0; i < yourArray.length; i++) {
			 		System.out.print(yourArray[i] + " ");
				}
			}
		}
		public static void shiftRight(int[] yourArray){ // method that shifts array to the right by 1 element
			Scanner input = new Scanner(System.in);
			System.out.println("Enter r to shift right");
			int temp = yourArray[yourArray.length-1];
				for(int i =8; i>=0; i--){
					yourArray[i+1] = yourArray[i];
				}
				yourArray[0]= temp;
				for (int i = 0; i < yourArray.length; i++) {
			 		System.out.print(yourArray[i] + " ");
				}
		}
		public static void swapPairs(int[] yourArray){ // method that consecutively swaps pairs of the array
			for(int i=0; i<10;i+=2){
				int temp = yourArray[i];
				yourArray[i] = yourArray[i+1];
				yourArray[i+1] =temp;
			}
				for (int i = 0; i < yourArray.length; i++) {
			 		System.out.print(yourArray[i] + " ");
				}
		}
	}

