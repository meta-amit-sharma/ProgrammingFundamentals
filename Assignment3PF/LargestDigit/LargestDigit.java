/*
 * This file contains the class named LargestDigit
 */
package Session3.LargestDigit;
/**
 * This class contains the function that finds the largest digit in a number
 * @author Amit Sharma
 * @version 1.0
 */
public class LargestDigit {
	/**
	 * This function takes a number
	 * and returns the larger number between 
	 * the last digit and the second last digit of the input number.
	 * The second last digit of the number is obtained by 
	 * recursively calling the function with the new input number which is
	 * the original number divided by 10.
	 * If the function has the single digit input,it returns the same value
	 * @param x input number
	 */
	public int largestdigit ( int x ) {
		/*This is the base condition for the recursion*/
		if( ( x / 10 ) == 0) {
			return x;
		}
		/*This returns the maximum of the last and the second last digit*/
		return Math.max( ( x % 10 ), largestdigit( x / 10 ) );
	}

}
