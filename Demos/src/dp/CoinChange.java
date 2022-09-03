package dp;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
	
	static Map<Integer, Integer> dp;
	
	public static void main(String args[]) throws Exception{
		dp = new HashMap<>();
		
		int[] coins = { 1,3,4 };
		int target = 10;
		
//		dp.put(target, f(coins, target));
//		
//		System.out.println( dp.get(target) );
//		
//		dp.entrySet().stream()
//			.forEach( entry -> 
//				System.out.println( entry.getKey() + " : " + entry.getValue() ) 
//			);
		
//		System.out.println( tabular(coins, target) );
		
		int ans = tabular(coins, target);
		if(ans == Integer.MAX_VALUE) System.out.println(-1);
		else System.out.println(ans);
	}
	
	static int f(int[] coins, int x) {
		// base case
		if(x==0) return 0;
		if(x<0) return Integer.MAX_VALUE;
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int ans = f(coins, x-coins[i]);
			if(ans < Integer.MAX_VALUE) min = Math.min( min, 1+ans );
		}
		return min;
	}
	
	static int topDown(int[] coins, int x) {
		// base case 
		if(x==0) return 0;
		if(x < 0) return Integer.MAX_VALUE;
		
		// if dp already has it
		if(dp.containsKey(x)) return dp.get(x);
		
		// else we solve it
		int min = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			int ans = topDown(coins, x-coins[i]);
			if(ans < Integer.MAX_VALUE) min = Math.min(min, 1+ans);
		}
		
		dp.put(x, min);
		return min;
	}
	
	static int tabular(int[] coins, int target) {
		int[] mem = new int[target+1];
		mem[0] = 0;
		for(int i=1; i<=target; i++) {
			mem[i] = Integer.MAX_VALUE;
		}
		
		for(int i=1; i<=target; i++) {
			for(int j=0; j< coins.length; j++) {
				if(i-coins[j] >= 0 && mem[i-coins[j]] != Integer.MAX_VALUE) {
					mem[i] = Math.min( mem[i], 1+mem[ i-coins[j] ] );
				}
			}
		}
		return mem[target];
	}
}
