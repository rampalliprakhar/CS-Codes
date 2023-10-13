//package Test;
/*
 * Author: Prakhar Rampalli
 * Written: 3/3/23
 * Last Updated: 3/5/23
 * 
 * Compilation: javac SumIntegersTest.java
 * Execution: java SumIntegersTest
 *
 * Description:
 * A program which tests the implementation of JUnit.
 *
 * Sample Output: 
 * True
 -------------------------------------------------*/
public class SumIntegers {
	public static int sum(int[] numbers){// method sum() taking integer numbers as parameters
		if(numbers == null){// checking to see if numbers taken is null
			return 0;// if null return 0
		}
		int result = 0; // initializing result to 0
		for(int i = 0; i < numbers.length; i++){ // traversing through the array
				result = result + numbers[i]; // adding the numbers
		}
		return result;// return the result after adding
	}
}
