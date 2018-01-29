package Session4.NQueen;

import static org.junit.Assert.*;

import org.junit.Test;

public class testNqueen {
	Nqueen nq = new Nqueen();
	
	@Test
	public void test() {
		int board[][] = new int[4][4];
		assertEquals(true, nq.nQueen(board, 0, 4));
		
	}
	@Test
	public void test2() {
		int board[][] = new int[8][8];
		assertEquals(true, nq.nQueen(board, 0, 8));
		
	}
	@Test
	public void test3() {
		int board[][] = new int[2][2];
		assertEquals(false, nq.nQueen(board, 0, 2));
		
	}

}
