package checkArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckArray {
    CheckArray ca=new CheckArray();
	@Test
	public void test() {
		int expected=1;
		int arr[]={1,2,3,4,5,6};
		int actual=ca.testArray(arr);
		assertEquals(expected,actual);
	}

	@Test
	public void test1() {
		int expected=1;
		int arr[]={1,1,1,4,5,6};
		int actual=ca.testArray(arr);
		assertEquals(expected,actual);
	}

}
