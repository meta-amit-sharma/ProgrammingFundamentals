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
  * @param str string to calculate permutation for
  * @param l starting index
  * @param r end index
  */
	void permute(String str, int l, int r, List<String> result) {
		if (l == r) {
			result.add(str); 
		} else {
			for (int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r, result);
				str = swap(str, l, i);
			}
		}
	}

 /**
  * Swap Characters at position
  * @param a string value
  * @param i position 1
  * @param j position 2
  * @return swapped string
  */
	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
    
	}

}

