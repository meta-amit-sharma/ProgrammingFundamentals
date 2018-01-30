/*
 * Class name- FindLongestSequence
 * 
 * @version 1.0
 * @author Amit Kumar Sharma
 */
package longestSequence;

/**
 * This class finds the longest sequence that occur in the array given
 * @version 1.0
 * @author Amit Kumar Sharma
 */
public class FindLongestSequence {
	
	/**
	 * the below function takes the sequence as an input and saves the longest increasing 
	 * sequence in another array and returns the final array. 
	 */
	 public int[] longestSequence ( int input[] ) {
	        int count = 0;								//to calculate the count of every occurring sequence
	        int maxcount = 0;							//to store the length of the longest sequence
	        int end = 0;								//to store the end point of the longest sequence that appeared
	        for ( int i = 1; i < input.length; i++ ) {
	            if ( input[i] > input[i - 1] ) {
	            	/*The count here increases till 
	            	 * the sequence is in increasing 
	            	 * order*/
	                count++;
	            } else {
	            	/*The value of the count resets*/
	                count=0;
	            }
	            if ( count > maxcount ) {
	            	/*If the count obtained above is 
	            	 * greater than the largest count (maxcount)
	            	 * we need to update the maximum count and
	            	 * the end position of the sequence.
	            	 */
	                end = i;
	                maxcount = count;
	            }
	        }
	        int result[] = new int[maxcount+1] ;			//Creating another array to store the result
	        /*The starting position of the longest sequence so obtained 
	         * will be at (end-maxcount) and the ending position is at end
	         */
	        for (int i= (end-maxcount), c = 0; i <= end; i++) {
	           result[c++] = input[i];						//copying the sequence in result array
	        }
	        return result;
	    }
	
}
