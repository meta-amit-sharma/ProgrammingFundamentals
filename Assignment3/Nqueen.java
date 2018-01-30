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
				board[ startRow ][ column ] = 1 ; 					//storing 1 in the current column indicates that queen is placed in that square
				if ( nQueen ( board, startRow + 1, dimensionOfMatrix) ) {
					return true; 							//returns true if the queen can be safely placed
				}
				board[ startRow ][ column ] = 0 ; 					//stores 0 again if the current position of queen is not safe during backtracking
			}
		}
		
		return false; 										// returns false if the queen is not safe in the current position
	}
	
	/**
	 * This function checks if placing the queen in the given square is safe
	 * @param board
	 * @param row
	 * @param column
	 * @param sizeOfBoard
	 * @return true if the position is safe for the queen
	 */
	boolean isSafe( int board[][], int row, int column, int sizeOfBoard ) {
		if ( checkRow (board, row, sizeOfBoard) ) {							//check for another queen in given row
			if ( checkColumn (board, column, sizeOfBoard) ) {					//check for another queen in given column
				if ( checkLeftDiagonal (board, row, column, sizeOfBoard) ) {			//check for another queen in left diagonal
					if ( checkRightDiagonal (board, row, column, sizeOfBoard) ) { 		//check for another queen in right diagonal
						return true;
					}
				} 
			}
		}
		return false;											//returns false if its not safe for the placement of queen
	}
	
	boolean checkRow (int board[][], int row, int sizeOfBoard ) {
		for(int column = 0; column < sizeOfBoard; column++) {
			if (board[row][column] == 1) {
				return false;
			}
		}
		return true; 
	}
	
	boolean checkColumn (int board[][], int column, int sizeOfBoard ) {
		for(int row = 0; row < sizeOfBoard; row++) {
			if (board[row][column] == 1) {
				return false;
			}
		}
		return true;
	}
	
	boolean checkLeftDiagonal (int board[][], int row, int column, int sizeOfBoard) {
		for (int rowIndex = row, columnIndex = column; (rowIndex >= 0) && (columnIndex >= 0); rowIndex--, columnIndex--) {
			if ( board[ rowIndex ][ columnIndex ] == 1) {
				return false;
			}
		}
		for (int rowIndex = row, columnIndex = column; (rowIndex < sizeOfBoard) && (columnIndex < sizeOfBoard); rowIndex++, columnIndex++) {
			if ( board[ rowIndex ][ columnIndex ] == 1) {
				return false;
			}
		}
		return true;
	}
	
	boolean checkRightDiagonal (int board[][], int row, int column, int sizeOfBoard) {
		for (int rowIndex = row, columnIndex = column; (rowIndex >= 0) && (columnIndex < sizeOfBoard); rowIndex--, columnIndex++) {
			if ( board[ rowIndex ][ columnIndex ] == 1) {
				return false;
			}
		}
		for (int rowIndex = row, columnIndex = column; (rowIndex < sizeOfBoard) && (columnIndex >= 0); rowIndex++, columnIndex--) {
			if ( board[ rowIndex ][ columnIndex ] == 1) {
				return false;
			}
		}
		return true;
	}
	
}
