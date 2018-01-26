/*
 * This file contains the class named FindGCD
 */
package Session3.GCD;

/**
 * This class contains the function 
 * Function takes two numbers as input 
 * and returns the GCD of the two numbers
 * @author Amit Sharma
 *
 */
public class FindGCD {
	
	/**
	 * This returns the GCD of two numbers
	 * @param x First number
	 * @param y Second number
	 * @return  GCD of the two number
	 */
	public int gcd (int x, int y) {
		
		if ( y == 0 ) {
			
			/*If y is zero it returns the non-zero number x*/
			if ( x != 0) {
				return x;
			}
			
			/*If  both the numbers are zero then the GCD is Undefined*/ 
			throw new ArithmeticException("Undefined Value");
		}
		
		/*If y completely divides x, then y is the GCD*/
		if ( ( x % y) == 0 ) {
			return y;
		}
		
		return gcd ( y, (x % y) );	
	}
	
}
