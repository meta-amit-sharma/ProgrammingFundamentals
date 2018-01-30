/*
 * This file contains a class Permutation	
 */
package Session4.PermutationString;

import java.util.ArrayList;
import java.util.List;
/**
 *Java program to print all permutations of a
 *given string.
 * @author Amit Sharma
 * @version 1.0
 */
public class Permutation {
	/**
	 * Driver function which calls the permute function
	 * which generates all the permutation of string.
	 * This function returns the final list which
	 * contains all the permutations of the given string
	 * @param input
	 * @return - List containing all permutations of String
	 */
	List<String> generatePermutation ( String input ) {
		List<String> result = new ArrayList<String>();
		int size = input.length();
		permute(input, 0, size-1, result );
		return result;
	}
	/**
  	* permutation function
  	* @param input string to calculate permutation for
  	* @param lowerIndex starting index
  	* @param upperIndex end index
  	*/
	void permute(String input, int lowerIndex, int upperIndex, List<String> result) {
		if (lowerIndex == upperIndex) {
			result.add(input); 
		} else {
			for (int index = lowerIndex; index <= upperIndex; index++) {
				input = swap(input, lowerIndex, index);
				permute(input, lowerIndex + 1, upperIndex, result);
				input = swap(input, lowerIndex, index);
			}
		}
	}
	/**
  	* Swap Characters at position
  	* @param input string value
  	* @param position1 
  	* @param position2 
  	* @return swapped string
  	*/
	public String swap(String input, int position1, int position2) {
		char temp;
		char[] charArray = input.toCharArray();
		temp = charArray[position1] ;
		charArray[position1] = charArray[position2];
		charArray[position2] = temp;
		return String.valueOf(charArray);
    	}
}
