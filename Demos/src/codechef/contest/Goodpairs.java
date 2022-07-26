package codechef.contest;

import java.util.Scanner;

public class Goodpairs {
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int result = 0;
			int n = sc.nextInt();
			
			long[] a = new long[n];
			long[] b = new long[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextLong();
			}
			
			for(int i=0; i<n; i++) {
				b[i] = sc.nextLong();
			}
			
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(a[i] == b[j] && a[j] == b[i]) result++;
				}
			}
			
			System.out.println(result);
		}
	}
}
