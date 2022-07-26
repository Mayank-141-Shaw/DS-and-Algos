package dp;

import java.util.Scanner;

public class SumTrian {
	
	static int[] dp;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[][] arr = new int[n][];
		    for(int i=0; i<n; i++){
		        arr[i] = new int[i+1];
		        for(int j=0; j<=i; j++){
		            arr[i][j] = sc.nextInt();
		        }
		    }
		    
		  //  // solve
		  //  dp = new int[n];
		  //  for(int i=0; i<n; i++){
		  //      dp[i] = arr[0][0];
		  //  }
		    
		  //  // initiate down
		  //  f(arr, 1, 0, n);
		  //  // initiate right
		  //  f(arr, 1, 1, n);
		    
		    System.out.println(solve(arr, n));
		}
	}
	
	static int f(int[][] arr, int i, int j, int n){
	    if(n==i){
	        return dp[i-1] + 0;
	    }
	    
	    int val = Math.max(f(arr, i+1, j, n), f(arr, i+1, j+1, n));
	    dp[i] = Math.max(dp[i], dp[i]+val);
	    
	    return dp[i];
	}
	
	static int solve(int[][] arr, int n){
	    for(int i=n-2; i>=0; i--){
	        for(int j=i; j>=0; j--){
	            arr[i][j] = Math.max( arr[i][j]+arr[i+1][j], arr[i][j]+arr[i+1][j+1] );
	        }
	    }
	    return arr[0][0];
	}
}
