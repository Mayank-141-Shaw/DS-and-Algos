package graph;

import java.util.Arrays;

public class FloydWarshall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// takes in a weight matrrix W
		int[][] W = {
				{0, 8, 99999, 1},
				{99999, 0, 1, 99999},
				{4, 99999, 0, 99999},
				{99999, 2, 9, 0}
				};
		FloydWarshall fw = new FloydWarshall();
		fw.floydWarshall(W);
		
		System.out.println("All pair shortest path");
		for(int i=0; i<W.length; i++) {
			for(int j=0; j<W.length; j++) {
				System.out.print(W[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * in case you need to return the updated array change return type
	 * to int[][]
	 */
	void floydWarshall(int[][] W){ 		
//		int[][] d = new int[W.length][W.length];
//		
//		// initialize d matrix
//		for(int i=0; i<W.length; i++) {
//			for(int j=0; j<W.length; j++) {
//				d[i][j] = W[i][j];
//			}
//		}
		
		for(int k=0; k<W.length; k++) {
			for(int i=0; i<W.length; i++) {
				for(int j=0; j<W.length; j++) {
					W[i][j] = Math.min(W[i][j], W[i][k] + W[k][j]);
				}
			}
		}
		
		// return W;
		
	}

}
