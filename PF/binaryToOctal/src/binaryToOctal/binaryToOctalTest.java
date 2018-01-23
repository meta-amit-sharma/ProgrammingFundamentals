package binaryToOctal;

import static org.junit.Assert.*;

import org.junit.Test;

public class binaryToOctalTest {

	BinaryToOctal bto=new BinaryToOctal();
	@Test(timeout = 0)
	public void test1() {
		assertEquals(50,bto.convertBinaryToOctal(101000));
	}
	@Test
	public void test2() {
		assertEquals(50,bto.convertBinaryToOctal(101001));
	}
	
	@Test
	public void test3() {
		assertEquals(50,bto.convertBinaryToOctal(1010034));
	}
}
