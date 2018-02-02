/*
 * This file contains the class named BinarySearch
 */
package Session3.BinarySearch;
/**
 * This class contains the recursive function
 * to find if the given number is present in the array
 * @author Amit Sharma
 *
 */
public class BinarySearch {
	/**
	 * This function takes the search term and the array as input
	 * and search using Binary search. It returns true if the number exists 
	 * in the array or else false
	 * @param upper is the upper limit of the array
	 * @param lower is the lower limit of the array
	 * @param inputArray array containing the terms
	 * @param searchElement is the search term
	 * @return final results
	 */
	public boolean binarySearch (int upper, int lower, int inputArray[], int searchElement ) {
		int middle = ( upper + lower ) / 2 ;
		/*Perform operation only when lower is less than upper*/
		if ( lower <= upper ) {	
			/*The search term is equal to the middle term of array*/
			if ( inputArray[ middle ] == searchElement ) {
				return true;
			} 
			if ( searchElement < inputArray[ middle ] ) {
				/*The search term is contained in the First part of array*/
				return binarySearch( middle-1, lower, inputArray, searchElement);
			} 
			if ( searchElement > inputArray[ middle ]  ) {
				/*The search term is contained in the Second part of array*/
				return binarySearch( upper, middle+1, inputArray, searchElement);
			}
		} 
		return false; //If the search term is not present in the array
	}
}
