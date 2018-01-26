package Session3.LinearSearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class testLinearSearch {
	LinearSearch ls = new LinearSearch();
	@Test
	public void test() {
		boolean expected = true;
		int inputArray[] = new int[] {1,2,3,4,5,6,7,8,9,10};
		int a = 0;
		int n = 13;
		boolean actual =ls.linearSearch(n, inputArray, a);
		assertEquals ( expected, actual );
	}

}
