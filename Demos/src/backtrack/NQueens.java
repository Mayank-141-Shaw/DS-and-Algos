package backtrack;

import java.util.Arrays;

public class NQueens {
	
	public static void main(String args[]) throws Exception{
		
		int n = 8;
		int[][] board = new int[n][n];
		
		Nqueen(board);
	}
	
	static void Nqueen(int[][] board) {
		if(NQueenUtil(board, 0)) {
			// print board
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board.length; j++) {
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	static boolean NQueenUtil(int[][] board, int col) {
		/** Check if all cols are done
		 * if yes then return true
		 * if not then loop through all rows for that col
		 */
		
		if(col >= board.length) {
			return true;
		}else {
			
			// loop through all rows
			for(int i=0; i<board.length; i++) {
				// if current pos is safe we mark the queen there and rcurse to next col
				if(isSafe(board, i, col)) {
					board[i][col] = 1;
					
					// recurse to next col, wth new board state
					if(NQueenUtil(board, col+1)) {
						return true;
					}
				}
				
				// else it was not good pos
				board[i][col] = 0;
			}
		}
		
		return false;
	}
	
	static boolean isSafe(int[][] board, int row, int col) {
		
		// check if all col before current col are suitable or not
		
		// check horizontally backwards
		for(int i=col-1; i>=0; i--) {
			if(board[row][i] == 1) return false;
		}
		
		// check diagonally down back
		
		for(int i=row+1, j=col-1; i < board.length && j >= 0; i++, j--) {
			if(board[i][j] == 1) return false;
		}
		
		// check diagonally up back
		for(int i=row-1, j=col-1; i >= 0 && j >= 0; i--, j--) {
			if(board[i][j] == 1) return false;
		}
		
		return true;
	}
}
