/*
 * This file contains the class named LinearSearch
 */
package Session3.LinearSearch;

/**
 * This class contains the recursive function
 * to find if the given number is present in the array
 * @author Amit Sharma
 *
 */
public class LinearSearch {
    
	/**
	 * This function takes the search term and the array as input
	 * and search using Linear search. It returns true if the number exists 
	 * in the array or else false
	 * @param n is the search term
	 * @param inputArray array containing the terms
	 * @param a counter variable
	 * @return final results
	 */
	public boolean linearSearch (int n, int inputArray[], int a ) {
		
		/*To check if we reach till the end of the Array*/
		if( a >= inputArray.length ) {
			return false;
		} 
		
		/*If we find that the given number is present in the Array*/
		if ( inputArray[ a ] == n ) {
			return true;
		}
		return linearSearch ( n, inputArray, a+1);
	}
}
