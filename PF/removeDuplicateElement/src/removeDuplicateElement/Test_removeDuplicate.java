package removeDuplicateElement;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_removeDuplicate {
	RemoveDuplicateElement rd=new RemoveDuplicateElement();
	@Test
	public void test() {
		int a[]=new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int expected[]=new int[] {2,5,4,6,3,8,9,0};
		int actual[]=rd.removeDuplicate(a);
		assertArrayEquals(expected,actual);
	}
	
	@Test
	public void test1() {
		int a[]=new int[] {1,1,1,1,2,3,4,5,6,6,6,6};
		int expected[]=new int[] {1,2,3,4,5,6};
		int actual[]=rd.removeDuplicate(a);
		assertArrayEquals(expected,actual);
	}

}
