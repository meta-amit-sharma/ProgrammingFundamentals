/*
 * This file contains the class named Nqueen 
 */
package Session4.NQueen;

/**
 * This class gives the solution to N-Queen problem
 * @author Amit Sharma
 * @version 1.0
 */
public class Nqueen {
    
	/**
	 * This function takes the board as input
	 * it then recursively determines the solution 
	 * to the N-Queen problem
	 * @param board array representing the chess board 
	 * @param startRow represents the current row
	 * @param dimensionOfMatrix represents the size of the board
	 * @return returns true if the queen can be placed in the current position
	 */
	boolean nQueen (int board[][], int startRow, int dimensionOfMatrix) {
		/*The base condition, returns true if all the queens has been placed */
		if ( startRow >= dimensionOfMatrix){
			return true;
		}
			for ( int column = 0 ; column < dimensionOfMatrix ; column++ ) {
				
				if ( isSafe( board, startRow, column, dimensionOfMatrix) ) {
					board[ startRow ][ column ] = 1 ; //storing 1 in the current column indicates that queen is placed in that square
					if ( nQueen ( board, startRow + 1, dimensionOfMatrix) ) {
						return true; //returns true if the queen can be safely placed
					}
					board[ startRow ][ column ] = 0 ; //stores 0 again if the current position of queen is not safe during backtracking
				}
			}
		
		return false; // returns false if the queen is not safe in the current position
	}
	
	/**
	 * This function checks if placing the queen in the given square is safe
	 * @param board
	 * @param row
	 * @param column
	 * @param n
	 * @return true if the position is safe for the queen
	 */
	boolean isSafe( int board[][], int row, int column, int n ) {
		if ( checkRow (board, row, n) ) {									//check for another queen in given row
			if ( checkColumn (board, column, n) ) {							//check for another queen in given column
				if ( checkLeftDiagonal (board, row, column, n) ) {			//check for another queen in left diagonal
					if ( checkRightDiagonal (board, row, column, n) ) { 	//check for another queen in right diagonal
						return true;
					}
				} 
			}
		}
		return false;														//returns false if its not safe for the placement of queen
	}
	
	boolean checkRow (int board[][], int row, int n ) {
		for(int i = 0; i < n; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		return true; 
	}
	
	boolean checkColumn (int board[][], int column, int n ) {
		for(int i = 0; i < n; i++) {
			if (board[i][column] == 1) {
				return false;
			}
		}
		return true;
	}
	
	boolean checkLeftDiagonal (int board[][], int row, int column, int n) {
		for (int i = row, j = column; (i >= 0) && (j >= 0); i--, j--) {
			if ( board[ i ][ j ] == 1) {
				return false;
			}
		}
		for (int i = row, j = column; (i < n) && (j < n); i++, j++) {
			if ( board[ i ][ j ] == 1) {
				return false;
			}
		}
		return true;
	}
	
	boolean checkRightDiagonal (int board[][], int row, int column, int n) {
		for (int i = row, j = column; (i >= 0) && (j < n); i--, j++) {
			if ( board[ i ][ j ] == 1) {
				return false;
			}
		}
		for (int i = row, j = column; (i < n) && (j >= 0); i++, j--) {
			if ( board[ i ][ j ] == 1) {
				return false;
			}
		}
		return true;
	}
	
}
