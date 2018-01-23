/**
 * Class name- RemoveDuplicateElement
 * 

 */

package removeDuplicateElement;

/**
 * This class removes the duplicate element in the given array
 * @version 1.0
 * @author Amit Kumar Sharma
 */
public class RemoveDuplicateElement {

	/**
	 * The method takes an array as input and scans its elements one by one
	 * after ensuring that the current element does not exist in the resultant array
	 * it inserts the current element in the resultant array
	 */
	int[] removeDuplicate( int input[] ) {
		int totalElements = input.length;					//gets the total elements
		int resultTemp[] = new int[totalElements];			//Temporary  array 
		int result_counter = 0;								//to count the total values for resultant array
		
		/*This loop traverse the input array*/ 
		for (int i = 0; i < totalElements; i++) {
			int element = input[i];							
			int flag = 0;
			
			/*This loop checks if the element exists in the resultant array*/
			for (int j = 0; j < result_counter; j++) {
				if (resultTemp[j] == element) {
					flag = 1;								//flag set to 1 if a duplicate element is found
					break;
				}
			}
			
			/*if the element is not duplicate then it is inserted in temporary array*/
			if (flag == 0){
				resultTemp[result_counter++] = element;		
			}
		}
		
		/*A new resultant array is created and the contents of temporary array is copied in it*/
		int result[] = new int[result_counter];				
		for (int i=0;i<result_counter;i++)
			result[i] = resultTemp[i];
		return result;
	}
	
}
