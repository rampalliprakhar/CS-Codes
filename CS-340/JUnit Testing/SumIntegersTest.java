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
import static org.junit.Assert.*;
import org.junit.Test;
public class SumIntegersTest {
	@Test
	public void testSum() {
		// This method tests basic addition of positive numbers
		int[] list = {1, 2, 3, 5, 7, 9}; //arrange - collection of positive integers
		int output = SumIntegers.sum(list);//action
		assertEquals(27, output);//assert
	}
	
	@Test
	public void testNegativeSum() {
		// This method tests basic addition of negative numbers
		int[] list1 = {-3, -5, -6, -7, -9, -12};//arrange - collection of negative integers
		int output = SumIntegers.sum(list1);//action
		assertEquals(-42, output);//assert
	}
	
	@Test
	public void testBothSum() {
		// This method tests addition of both negative and positive numbers
		int[] list2 = {-5, -6, -9, 10, 14};	//arrange - collection of both positive and negative integers
		int output = SumIntegers.sum(list2);//action
		assertEquals(4, output);//assert
	}
	
	@Test
	public void testEmptySum() {
		// This method tests whether elements in the list is empty
		int[] emptyList = {};//arrange - declare emptyList empty{}
		int output = SumIntegers.sum(emptyList); //action
		assertEquals(0, output);//assert
	}
	
	@Test
	public void testNullSum() {
		// This method tests whether elements in the list is null
		int[] nullList = null;//arrange - declare nullList null
		int output = SumIntegers.sum(nullList);	//action
		assertEquals(0, output);//assert
	}
}
