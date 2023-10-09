 /* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 11/12/21
 * Last Updated: 11/12/21
 *
 * Compilation: javac ArrayTest.java
 * Execution: java ArrayTest
 *
 * Description:
 * A program which swaps random two-rows, columns, and forms transponse in two-dimensional array based on command-line arguments.
 * 
 * Sample Output:
 * 11 30 58 90 69
 * 73 68 78 26 91
 * 1 39 83 73 66
 * 4 4 14 46 89
 * 1: Swap two random rows
 * 2: Swap two random columns
 * 3: Form array transpose
 * 4: Exit
 * 1
 * 11 30 58 90 69
 * 1 39 83 73 66
 * 73 68 78 26 91
 * 4 4 14 46 89
 -------------------------------------------------*/
import java.util.Scanner;
public class ArrayTest{
    public static void main(String[]args)
    {
        // int row = 0; int column = 0;
         
        int norows= Integer.parseInt(args[0]); // command-line parameters
         
        int nocols= Integer.parseInt(args[1]); // command-line parameters
         
        int[][] matrix = new int[norows][nocols]; // 2-d matrix based on rows and columns
     
        for(int row=0; row<matrix.length; row++)
        {
            for(int column=0; column<matrix[row].length; column++)
            {
                matrix[row][column] = (int)(Math.random()*100); // generates random rows and colums
            }
        }
     
        while(true)
        {
            for(int row=0; row<matrix.length; row++)
            {
                for(int column=0; column<matrix[row].length; column++)
                {
                    System.out.print(matrix[row][column] + " ");
                }
                System.out.println();
            }
            String option = menu();
            switch(option){
                case "1": swapRows(matrix);
                break;
                case "2": swapColumns(matrix);
                break;
                case "3": matrix=arrayTranspose(matrix);
                break;
                case "4": System.exit(0); 
                default: System.out.println("Incorrect option - Try again"); 
            }
        }
    }
 
    static String menu(){ // displays 2-d array operations
        Scanner input = new Scanner(System.in);
        System.out.println("1: Swap two random rows ");
        System.out.println("2: Swap two random columns");
        System.out.println("3: Form array transpose");
        System.out.println("4: Exit");
        return input.nextLine();
    }
     
    static void swapRows(int[][]array) // swaps two random rows
    {
        int row1=(int)(Math.random()*array.length);
        int row2=(int)(Math.random()*array.length);
        int[]temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }
     
    static void swapColumns(int[][]array) // swaps two random columns
    {
        int column1=(int)(Math.random()*array[0].length);
        int column2=(int)(Math.random()*array[0].length);
        for(int row=0; row<array.length; row++){
            int temp = array[row][column1];
            array[row][column1]=array[row][column2];
            array[row][column2]=temp;
        }
    }
    static int[][] arrayTranspose(int[][]array) // performs 2-d array transpose
    {
        System.out.println("Transpose of array");
         
        int[][] newarray = new int [array[0].length][array.length];
         
        for(int row=0; row<array.length; row++){
         
            for(int column=0; column<array[row].length; column++){
             
            newarray[column][row] = array[row][column];
            
            }
        }
        return newarray;
     
    }
}