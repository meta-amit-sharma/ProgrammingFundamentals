package Session4.NQueen;

public class printNQueen {
	
	public static void main( String args[]) {
		int board[][] = new int[4][4];
		int n = 4;
		Nqueen nq = new Nqueen();
		nq.nQueen(board, 0, n);
		
		for(int i=0;i<n;i++){
			for(int j =0 ;j < n; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}
