package dp;


/**
 * This is a problem where the array is a circular array representing a circular road neighbourhood
 * 
 * The robber can only rob houses that are not adjacent to each other
 * 
 * So in this the fisrt and last house are adjacent so we cant use both at  same time
 * 
 * Thus we have split in two ways, once going first to 2nd last house
 * then 2nd house to last house
 * 
 * And then we return the max of both values
 * 
 * */

public class HouseRobber2 {

	public static void main(String[] args) {
		int[] arr = {20, 21, 8, 5, 4, -10, 1, 18, 63};
		
		System.out.println( Math.max( solve(arr, 0, arr.length-1), solve(arr, 1, arr.length)) );

	}
	
	static int solve( int[] arr, int start, int end ) {
		int prev = arr[start];
		int prevPrev = 0;
		
		for(int i=start+1; i<end; i++) {
			int cur = Math.max( prev , prevPrev + arr[i]);
			prevPrev = prev;
			prev = cur;
		}
		
		return Math.max(prev, prevPrev);
	}

}
