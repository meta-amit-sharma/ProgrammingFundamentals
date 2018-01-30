package merge;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_merge {
	 MergeArray merge=new MergeArray();
	 
	@Test
	public void test() {
		int a[]= new int[] {1,2,3,4,5,6};
		int b[]=new int[] {3,5,6,8,9,10};
		int c[]=new int[12];
		int bsize=6;
		int asize=6;
		int expected[]=new int[] {1,2,3,3,4,5,5,6,6,8,9,10};
		
		assertArrayEquals(expected,merge.join(a, asize, b, bsize, c));
	}

}
