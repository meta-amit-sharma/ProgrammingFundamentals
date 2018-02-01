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
	String spaces (int row, int n) {
		String spaceString = "";
		for (int spaceCounter = 0; spaceCounter < row; spaceCounter++) {
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
		for (int numberCounter = 1; numberCounter < (n - row) + 1; numberCounter++ ) {
			numberString += numberCounter;
		}
		return numberString;
	}
	/**
	 * This function returns String of final pyramid
	 * @param n
	 * @return
	 */
	String[] print (int n) {
		String pyramid[] = new String[n];
		if ( n > 0 && n < 10 ) {
			System.out.println(" Please give value of n between 1-9 ");
			return pyramid;
		}
		for (int index = 0; index < n; index++) {
			pyramid[index] = ( spaces(index, n) + numbers(index, n) );	//concatenates space and number string 
			System.out.println(pyramid[index]);
		}
		return pyramid;
	}
	
}
