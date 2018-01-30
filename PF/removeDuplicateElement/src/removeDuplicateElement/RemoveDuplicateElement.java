/**
 * Class name- RemoveDuplicateElement
 * 

 */

package Session1.removeDuplicateElement;

import java.util.HashSet;
import java.util.Set;

/*
 * This class removes the duplicate element in the given array
 */
public class RemoveDuplicateElement {

	/*
	 * The method takes an array as input and scans its elements one by one
	 * and adds it in the final set.
	 */
	Set<Integer> removeDuplicate( int input[] ) {
		Set<Integer> result = new HashSet<Integer>();			//Final Set
		/*This loop traverse the input array*/ 
		for(int index = 0; index < input.length; index++) {
		result.add(input[index]);
		}
		return result;
	}
	
}
