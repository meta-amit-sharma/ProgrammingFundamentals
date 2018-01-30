/*
 * This file contains a class named FindRemainder 
 */
package Session3.Remainder;
/**
 * This class contains a method that finds the remainder 
 * when one number is divided by the other. 
 * @author Amit Sharma
 * @version 1.0
 */
public class FindRemainder {
	/**
	 * This function takes two parameters as input,and calculated the remainder 
	 * when the Divisor divides the Dividend
	 * @param x is Dividend
	 * @param y is Divisor
	 */
	int rem ( int x, int y ) {
		/*Since the number can't be divided by 0*/
		if ( y == 0 ) {
			throw new ArithmeticException("Cannot Divide by Zero");  
		}
		/*The base condition of the recursion call,
		 * if the divisor becomes greater than the dividend */
		if ( y > x ) {
			return x;
		}
		/*Recursive call,where the divisor is subtracted from the dividend 
		 * and the result is passed as the new dividend*/
		return rem ( ( x - y ), y );
	}
}
