/*
 * Class name- CheckArray
 * 
 */

package checkArray;

/**
 * This class checks if the given array is in Ascending or Descending order, or it is unordered.
 * @version 1.0
 * @author Amit Kumar Sharma
 */
public class CheckArray {
	 /**
	  * The below method checks the array.
	  * It returns 1 if the array is in Ascending order
	  * It returns 2 if the array is in decreasing order
	  * It returns 0 otherwise
	  * The array for example {1,1,1,1} is assumed to be unordered,
	  * since we can't place it in either of the two sections.
	  */
	  public int testArray(int input[]){
		   int i;
		   
		   /*It skips all the equal numbers at the beginning of array for example {1,1,1,2,3} is increasing*/
		   for(i=0;(input[i]==input[i+1])&&i<input.length-2;i++);		
		   
	       if( input[i] > input[i+1] ){					//this block checks if the array is descending
	           for( int k=i; k<input.length-1; k++){
	               if( input[k] < input[k+1])				//checks if any element defies the order
	                return 0;								
	           }
	            return 2;
	        }
	        if( input[i] < input[i+1] ){					//this block checks if the array is ascending
	           for( int k=i; k<input.length-1; k++){
	               if( input[k] > input[k+1])				//checks if any element defies the order
	                return 0;
	            }
	            return 1;
	        }
	       return 1;							//function returns 1 if the array contains same elements
	    }

}
