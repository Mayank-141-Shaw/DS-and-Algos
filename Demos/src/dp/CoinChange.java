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
		
		System.out.println( tabular(coins, target) );
	}
	
	static int f(int[] coins, int x) {
		
		if(dp.containsKey(x)) return dp.get(x);
		
		// base case
		if(x == 0) {
			dp.put(x, 0);
			return 0;
		}
		if(x < 0) return Integer.MAX_VALUE;
		
		// recursively find min with all coins
		int cur = Integer.MAX_VALUE;
		for(int i=0; i<coins.length; i++) {
			cur = Math.min( cur, f(coins, x-coins[i]) );
		}
		
		// updating the dp
		dp.put(x, cur+1);
		
		return cur+1;
		
	}
	
	static int tabular(int[] coins, int target) {
		
		int[] mem = new int[target+1];
		
		for(int i=1; i<target+1; i++) {
			mem[i] = Integer.MAX_VALUE;
		}
		mem[0] = 0;
		// update the coins cases as known cases
		for(int i=0; i<coins.length; i++) {
			mem[coins[i]] = 1;
		}
		
		
		for(int i=1; i<=target; i++) {
			for(int j=0; j<coins.length; j++) {
				if(i-coins[j] >= 0) {
					mem[i] = Math.min(mem[i], mem[i-coins[j]]+1);
				}	
			}
		}
		
		
		return mem[target];
	}
}
