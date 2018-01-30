/*
 * This program will find the way for knight to
 * visit all square once of n X n chess board.
 */
package Session4.KnightsTour;
/**
 * This class implements the algorithm to fins the path.
 * @author Amit Sharma
 * @version 1.0
 */
public class KnightsTour {
	/**
	 * This method return the whether knight completed its tour.
	 * @param board - chess board of nXn size
	 * @param dimension - dimension of chess board
	 * @return either true or false
	 */
	static boolean knightsTour ( int board[][], int dimension) {
		board[0][0] = 1;
		return (knightsVisit (board, dimension, 0, 0, 1)) ;
	}
	/**
	 * This method check if the square is safe for knight to visit 
	 * @param board
	 * @param dimension
	 * @param rowNum - row number to check
	 * @param colNum - column number to check
	 * @return either true or false
	 */
	static boolean isSafe ( int board[][], int dimension, int rowNum, int colNum) {
		return ( (rowNum >= 0) && (rowNum < dimension) && (colNum >=0) && (colNum < dimension) && (board[rowNum][colNum] == 0) );
	}
	/**
	 * This method implements the algorithm.
	 * @param board
	 * @param dimension
	 * @param rowNum
	 * @param colNum
	 * @param count - keeps the count of squares visited in total
	 */
	static boolean knightsVisit ( int board[][], int dimension, int rowNum, int colNum, int count) {
		/*if all squares are visited return true*/
		if( count == dimension * dimension) {
			return true;
		}
		/*check for all possible 8 cases to move*/
		/*First case*/
		if ( isSafe (board, dimension, rowNum + 2, colNum + 1) ) {
			board[rowNum + 2][colNum + 1] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum + 2, colNum + 1, count + 1) ) {
				return true;
			}
			board[rowNum + 2][colNum + 1] = 0;				//not safe backtrack
		}
		/*Second case*/
		if ( isSafe (board, dimension, rowNum + 1, colNum + 2) ) {
			board[rowNum + 1][colNum + 2] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum + 1, colNum + 2, count + 1) ) {
				return true;
			}
			board[rowNum + 1][colNum + 2] = 0;				//not safe backtrack
		}
		/*Third case*/
		if ( isSafe (board, dimension, rowNum - 1, colNum + 2) ) {
			board[rowNum - 1][colNum + 2] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum - 1, colNum + 2, count + 1) ) {
				return true;
			}
			board[rowNum - 1][colNum + 2] = 0;				//not safe backtrack
		}
		/*Fourth case*/
		if ( isSafe (board, dimension, rowNum - 2, colNum + 1) ) {
			board[rowNum - 2][colNum + 1] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum - 2, colNum + 1, count + 1) ) {
				return true;
			}
			board[rowNum - 2][colNum + 1] = 0;				//not safe backtrack
		}
		/*Fifth case*/
		if ( isSafe (board, dimension, rowNum - 2, colNum - 1) ) {
			board[rowNum - 2][colNum - 1] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum - 2, colNum - 1, count + 1) ) {
				return true;
			}
			board[rowNum - 2][colNum - 1] = 0;				//not safe backtrack
		}
		/*Sixth case*/
		if ( isSafe (board, dimension, rowNum - 1, colNum - 2) ) {
			board[rowNum - 1][colNum - 2] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum - 1, colNum - 2, count + 1) ) {
				return true;
			}
			board[rowNum - 1][colNum - 2] = 0;				//not safe backtrack
		}
		/*Seventh case*/
		if ( isSafe (board, dimension, rowNum + 1, colNum - 2) ) {
			board[rowNum + 1][colNum - 2] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum + 1, colNum - 2, count + 1) ) {
				return true;
			}
			board[rowNum + 1][colNum - 2] = 0;				//not safe backtrack
		}
		/*Eighth case*/
		if ( isSafe (board, dimension, rowNum + 2, colNum - 1) ) {
			board[rowNum + 2][colNum - 1] = count + 1;		//if safe then make a visit
			
			if (knightsVisit (board, dimension, rowNum + 2, colNum - 1, count + 1) ) {
				return true;
			}
			board[rowNum + 2][colNum - 1] = 0;				//not safe backtrack
		}
		return false;			//return false or backtrack if no case is safe to visit
	}
	/**
	 * main method to test the above implementation
	 */
	public static void main(String args[]) {
		int dimension = 8;
		int[][] board = new int[dimension][dimension];
		knightsTour(board, dimension);
		for (int row = 0; row < dimension; row++) {
			for (int column = 0;column < dimension; column++) {
				System.out.print( board[row][column] + "  ");
			}
			System.out.println();
		}
	}
}
