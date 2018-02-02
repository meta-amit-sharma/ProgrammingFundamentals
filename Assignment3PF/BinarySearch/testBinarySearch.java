package Session3.BinarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBinarySearch {

	BinarySearch bs = new BinarySearch();
	@Test
	public void test() {
		boolean expected = true;
		int inputArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		boolean actual =bs.binarySearch(inputArray.length - 1, 0, inputArray, 3);
		assertEquals ( expected, actual );
	}

}
