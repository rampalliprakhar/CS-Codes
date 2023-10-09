/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 11/03/21
 * Last Updated: 11/03/21
 *
 * Compilation: javac EliminateDuplicates.java
 * Execution: java EliminateDuplicates
 *
 * Description:
 * A program which eliminate duplicates in one-dimensional array.
 * 
 * Sample Output:
 * Enter 10 numbers: 1 2 3 1 2 3 4 4 4 6
 * 1 2 3 4 6
 * 
 -------------------------------------------------*/
import java.util.Scanner;
public class EliminateDuplicates{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] list = new int[10]; // list array stores 10 elements
		for(int i = 0; i < 10; i++){
			list[i] = input.nextInt();
		}
		eliminateDuplicates(list); // calls a method
	}
	public static int[] eliminateDuplicates(int[] list){ // method that eliminate duplicates based on list array as parameter
		for(int i = 0; i < list.length; i++){
			int[] newArray = new int[list.length];
			int newIndex = 0;
			int temp = list[i];
			for(int j = 0; j<list.length; j++){
				if(temp!= list[j]){
					newArray[newIndex] = list[j];
					newIndex++;
				} else if(j==i){
					newArray[newIndex] = list[j];
					newIndex++;
				}
			}
			list = new int[newIndex];
			for(int k=0; k<list.length; k++){
				list[k]= newArray[k];
			}
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		return list;
	}
}