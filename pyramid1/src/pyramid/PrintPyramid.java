/*
 * This file contains the class PrintPyramid to print pattern
 */

/**
 * Class contains 3 methods
 * one method returns the string containing spaces
 * one method returns the string containing numbers
 * last method returns the string containing final pyramid
 * @author Amit Kumar Sharma
 * @version 1.0
 */
public class PrintPyramid {
	/**
	 * This function returns String of spaces
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces (int row, int n)  {
		String spaceString = "";
		for (int spaceCounter = 0; spaceCounter < n - row; spaceCounter++) {
			spaceString += " ";
		}
		return spaceString;
	}
	/**
	 * This function returns String of numbers
	 * @param row
	 * @param n
	 * @return
	 */
	String numbers (int row, int n) {
		String numberString = "";
		int upCounter;								//counter for loops
		/*This loop is for the numbers in increasing order*/
		for (upCounter = 1; upCounter <= row; upCounter++) {
			numberString += upCounter;
		}
		/*This loop is for the numbers in decreasing order*/
		for (int downCounter = upCounter - 2; downCounter >= 1; downCounter--) {
			numberString += downCounter;
		}
		return numberString;
	}
	/**
	 * This function returns String of final pyramid
	 * @param n
	 * @return
	 */
	String[] print (int n) {
		String pyramid[] = new String[ 2 * n - 1];
		/*This loop prints the upper half of the pattern*/
		for (int index = 1; index <= n; index++) {
			pyramid[index - 1] = ( spaces(index, n) + numbers(index, n) ); 		//concatenates space and number string 
			System.out.println(pyramid[index - 1]);
		}
		/*This loop prints the lower half of the pattern*/
		for (int index = 4; index >= 1; index--) {
			pyramid[(2 * n - 1) - index] = ( spaces(index, n) + numbers(index, n) );	//concatenates space and number string 
			System.out.println(pyramid[(2 * n - 1) - index]);
		}
		return pyramid;
	}
}
