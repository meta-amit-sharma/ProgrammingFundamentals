/*
 * This file contains the class PrintPyramid to print pattern
 */

/**
 * Class contains 3 methods
 * one method returns the string containing spaces
 * one method returns the string containing numbers
 * last method returns the string containing final pyramid
 * @author Amit Kumar Sharma
 *
 */
public class PrintPyramid {

	/**
	 * This function returns String of spaces
	 * @param row
	 * @param n
	 * @return
	 */
	String spaces (int row, int n)  {
		String s = "";
		for (int i = 0; i < n - row; i++) {
			s += " ";
		}
		return s;
	}
	
	
	/**
	 * This function returns String of numbers
	 * @param row
	 * @param n
	 * @return
	 */
	String numbers (int row, int n) {
		String s = "";
		int i;							//counter for loops
		
		/*This loop is for the numbers in increasing order*/
		for (i = 1; i <= row; i++) {
			s += i;
		}
		
		/*This loop is for the numbers in decreasing order*/
		for (int j = i - 2; j >= 1; j--) {
			s += j;
		}
		return s;
	}
	
	
	/**
	 * This function returns String of final pyramid
	 * @param n
	 * @return
	 */
	String[] print (int n) {
		String s[] = new String[ 2 * n - 1];
		
		/*This loop prints the upper half of the pattern*/
		for (int i = 1; i <= n; i++) {
			s[i - 1] = ( spaces(i, n) + numbers(i, n) ); 	//concatenates space and number string 
			System.out.println(s[i - 1]);
		}
		
		/*This loop prints the lower half of the pattern*/
		for (int i = 4; i >= 1; i--) {
			s[(2 * n - 1) - i] = ( spaces(i, n) + numbers(i, n) );	//concatenates space and number string 
			System.out.println(s[(2 * n - 1) - i]);
		}
		return s;
	}
	
}
