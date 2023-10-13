/*
 * Author: Prakhar Rampalli
 * Written: 2/26/23
 * Last Updated: 2/26/23
 * 
 * Compilation: javac FileChecker.java
 * Execution: java FileChecker
 *
 * Description:
 * A program that checks whether the filename conforms to linux rules for filenames
 *
 * Sample Output: 
 * Hello.txt
 * true
 *
 * InputValidation.mov
 * true
 * 
 * ..
 * false
 * 
 * File@.txt
 * false
 *
 -------------------------------------------------*/
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class FileChecker {
	public static boolean fileValidator(String filename){
		while(!filename.equals("")) {	// runs till the filename is not empty
			if(filename.equals(".") || filename.equals("..")) { // checking to see whether the file contains single or double dots.
				return false; // if found return false
			}
			else { // if not found
				String inputPattern = "[a-zA-Z0-9._,]+.(pdf|doc|xls|csv|txt|mov)$"; // pattern for checking the format
				Pattern pattern = Pattern.compile(inputPattern); // compiles pattern using inputPattern
				Matcher match = pattern.matcher(filename); // matcher will match each words with the format
				boolean matched = match.find(); // boolean will find using filename and inputPattern
				if(matched) { // if successful
					return true;
				}
			}	return false; // if not matched

		}
		return false; // filename is empty
	}
	public static void main(String[]args){
		System.out.println("Please enter filename: ");
		Scanner input = new Scanner(System.in);
		String file = input.next();
		System.out.println(fileValidator(file));
	}
}
