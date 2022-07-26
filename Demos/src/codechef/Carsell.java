package codechef;

import java.io.IOException;
import java.util.*;

public class Carsell {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
		while(t-- >0) {
			long n = sc.nextLong();
			PriorityQueue<Long> q = new PriorityQueue<>(Comparator.reverseOrder());
			for(long i=0; i<n; i++) {
				q.add(sc.nextLong());
			}
			long ans = 0;
			for(long i=0; i<n; i++) {
				ans += Math.max(0l, q.poll()-i);
				ans = ans % 1000000007;
			}
			System.out.println(ans);
		}
	}
}
