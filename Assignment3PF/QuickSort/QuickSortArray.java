/*
 * This file contains the class named QuickSort
 */
package Session3.QuickSort;
/**
 * This class contains two method one for partitioning the array
 * and other for performing quicksort
 * @author Amit Sharma
 * @version 1.0
 */
public class QuickSortArray {
	/**
	 * This function takes the array to be sorted, and performs sorting 
	 * @param inputArray
	 * @param startIndex
	 * @param endIndex
	 * @return returns the final array
	 */
	public int[] quicksort ( int inputArray[], int startIndex, int endIndex ) {
		if ( startIndex < endIndex ) {
			/*to find the position from where the array needs to be partitioned*/
			int pivot = partition ( inputArray, startIndex, endIndex );
			/*for the first half of the array*/
			quicksort ( inputArray, startIndex, pivot - 1 );
			/*for the second half of the array*/
			quicksort ( inputArray, pivot + 1, endIndex );
		}
		return inputArray;
	}
	/**
	 * This function returns the position from where the array needs to be partitioned
	 * and also places the pivot element in its correct place
	 * @param arr
	 * @param low
	 * @param high
	 * @return returns the position of pivot element
	 */
	public int partition ( int arr[], int low, int high ) {
		int largeElementIndex = low - 1;
		/*taking pivot to be the last element of array */
		int pivot = arr[ high ];
		/* Swapping is performed here to bring all the elements which are less than
		 * the pivot element to the left side, while all the elements greater than 
		 * the pivot elements to the right side
		 */
		for ( int j = low; j < high; j++) {
			if ( (arr[ j ] < pivot) ) {
				i++;
				if ( i != j ) {
					arr = swap (arr, j, i);
				}
			}
		}
		/* here the pivot element is brought in its right location*/
		arr = swap (arr, high, (i + 1) );
		return ( i + 1 ); //position of the pivot element
	}
	
	/**
	 * A function to swap values within array
	 * @param arr - input array
	 * @param position1
	 * @param position2
	 * @return
	 */
	public int[] swap (int[] arr, int position1, int position2) {
		int temp = arr[ position1 ];
		arr[ position1 ] = arr[ position2 ];
		arr[ position2 ] = temp;
		return arr;
	}

}
