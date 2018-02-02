package Session3.QuickSort;

import static org.junit.Assert.*;

import org.junit.Test;

public class testQuickSort {
	QuickSortArray qs = new QuickSortArray();
	@Test
	public void test() {
		int inputArray[] = new int[] {1,5,2,8,3,9,23,67,13};
		int expected[] = new int[] {1,2,3,5,8,9,13,23,67};
		assertArrayEquals(expected, qs.quicksort(inputArray, 0, inputArray.length - 1));
	}

}
