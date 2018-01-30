/*
 * This file contains the class named LinearSearch
 */
package Session3.LinearSearch;
/**
 * This class contains the recursive function
 * to find if the given number is present in the array
 * @author Amit Sharma
 * @version 1.0
 */
public class LinearSearch {
    	/**
	 * This function takes the search term and the array as input
	 * and search using Linear search. It returns true if the number exists 
	 * in the array or else false
	 * @param searchElement is the search term
	 * @param inputArray array containing the terms
	 * @param counter counter variable
	 * @return true if element found
	 */
	public boolean linearSearch (int searchElement, int inputArray[], int counter ) {
		/*To check if we reach till the end of the Array*/
		if( counter >= inputArray.length ) {
			return false;
		} 
		/*If we find that the given number is present in the Array*/
		if ( inputArray[ counter ] == searchElement ) {
			return true;
		}
		return linearSearch ( searchElement, inputArray, counter + 1 );
	}
}
