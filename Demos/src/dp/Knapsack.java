package dp;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans = {0};
		int[] p = {1,2,3};
		int[] w = {4,5,1};
		int k = 4;
		int n = w.length;
		
		knapsack(k, 0, w, p, 0, n, ans);
		
		System.out.println(ans[0]);
		
		int[][] mem = new int[k+1][n];
		System.out.println(knapsack_tab(k, w, p, n));
	}
	
	public static void knapsack(int k, int profit, int[] w, int[] p, int i, int n, int[] res) {
		if(i==n) {
			res[0] = Math.max(res[0], profit);
			return;
		}
		
		if(k>=w[i]) {
			knapsack(k-w[i], profit+p[i], w, p, i+1, n, res);
		}
		knapsack(k, profit, w, p, i+1, n, res);
	}
	
	public static void knapsack_mem(int k, int i, int profit, int[][] mem, int[] w, int[] p) {
		if(i==w.length) {
			mem[k][i] = Math.max(mem[k][i], profit);
			return;
		}
		
		if(mem[k][i] != 0) return;
	}

	public static int knapsack_tab(int k, int[] w, int[] p, int n) {
		int[][] dp = new int[n+1][k+1];
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=k; j++) {
				if(j-w[i-1] >= 0) {
					dp[i][j] = Math.max(dp[i][j], p[i-1]+dp[i-1][j-w[i-1]]);
				}
			}
		}
		
		return dp[n][k];
	}
}
