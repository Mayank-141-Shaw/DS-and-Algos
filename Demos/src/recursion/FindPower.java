package recursion;

import java.util.HashMap;
import java.util.Map;

public class FindPower {
	
	static Map<Integer, Integer> dp;
	
	public static void main(String args[]) {
		dp = new HashMap<>();
		
		int a =2;
		int pow = 20;
		
		dp.put(pow, power(a, pow));
		
		System.out.println(dp.get(pow));
		dp.clear();
	}
	
	public static int power(int a, int b) {
		if(b==0) {
			dp.put(b, 1);
			return 1;
		}else if(b==1) {
			dp.put(b, a);
			return a;
		}
		
		if(dp.containsKey(b)) return dp.get(b);
		
		if(b%2 == 0) {
			int temp = power(a, b/2);
			dp.put(b, temp*temp);
			return temp;
		}else {
			int temp = power(a, (b-1)/2);
			dp.put(b, a*temp*temp);
			return temp;
		}
	}
}
