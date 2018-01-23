/*
 * Class name- MergeArray
 * 

 */

package merge;

/**
 * This class merges the two different sorted array and the resultant array thus obtained is sorted
 * @version 1.0
 * @author Amit Sharma 
 */
public class MergeArray {
	
	/**
	 * The function below takes two sorted array which are either in ascending or in descending
	 */
	int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		int min = (asize < bsize) ? asize : bsize ;					//finds the smallest array
		
		/**
		 * Counter variables initialized to 0 for all the three arrays a,b and c
		 */
		int counter_a = 0;
		int counter_b = 0;
		int counter_c = 0;
		
		/*Merges the array a and b into c in ascending order*/
		for (int i = 0; i < min; i++) {
			if ( a[counter_a] < b[counter_b] ) {
				c[counter_c++] = a[counter_a++];
			} else {
				c[counter_c++] = b[counter_b++];
			}
		}
		
		
		/*Checks if array a is not completely traversed*/
		if ( counter_a < asize ) {
			while ( counter_a < asize ) {
				c[counter_c++] = a[counter_a++];
			}
		}
		
		/*Checks if array b is not completely traversed*/
		if ( counter_b < bsize ) {
			while ( counter_b < bsize) {
				c[counter_c++] = b[counter_b++];
			}
		}
		return c;
	}

}
