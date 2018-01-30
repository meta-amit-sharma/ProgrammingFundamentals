package longestSequence;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestLongestSequence {
	FindLongestSequence ls=new FindLongestSequence();
	@Test
	public void test() {
		int expected[]={1,2,4,5,6,7,8,9};
		int arr[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int actual[]=ls.longestSequence(arr);
		assertArrayEquals(expected,actual);
	}

}
