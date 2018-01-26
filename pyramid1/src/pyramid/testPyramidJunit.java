package pyramid;

import static org.junit.Assert.*;

import org.junit.Test;

public class testPyramidJunit {
	PrintPyramid pr=new PrintPyramid();
	@Test
	public void test1() {
		int n=5;
		String expected="1";
		String actual=pr.numbers(1, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test2() {
		int n=5;
		String expected="121";
		String actual=pr.numbers(2, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test3() {
		int n=5;
		String expected="12321";
		String actual=pr.numbers(3, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test4() {
		int n=5;
		String expected="1234321";
		String actual=pr.numbers(4, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void test5() {
		int n=5;
		String expected="123454321";
		String actual=pr.numbers(5, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS1() {
		int n=5;
		String expected="    ";
		String actual=pr.spaces(1, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS2() {
		int n=5;
		String expected="   ";
		String actual=pr.spaces(2, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS3() {
		int n=5;
		String expected="  ";
		String actual=pr.spaces(3, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS4() {
		int n=5;
		String expected=" ";
		String actual=pr.spaces(4, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testS5() {
		int n=5;
		String expected="";
		String actual=pr.spaces(5, n);
		assertEquals(expected,actual);
	}
	
	@Test
	public void testPrint() {
		int n=5;
		String expected[]={"    1",
						   "   121",
						   "  12321",
						   " 1234321",
						   "123454321",
						   " 1234321",
						   "  12321",
						   "   121",
						   "    1"};
		String actual[]=pr.print(n);
		assertArrayEquals(expected,actual);
	}

}
