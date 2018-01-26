package Session3.BinarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBinarySearch {

	BinarySearch bs = new BinarySearch();
	@Test
	public void test() {
		boolean expected = true;
		int inputArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int lower = 0;
		int upper = 9;
		int n = 3;
		boolean actual =bs.binarySearch(upper, lower, inputArray, n);
		assertEquals ( expected, actual );
	}

}
