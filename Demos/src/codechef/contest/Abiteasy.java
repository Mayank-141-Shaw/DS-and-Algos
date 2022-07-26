package codechef.contest;

import java.util.Scanner;

public class Abiteasy {
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int res = 0;
			int n = sc.nextInt();
			long k = sc.nextLong();
			
			long[] a = new long[n];
			
			for(int i=0; i<n; i++) {
				a[i] = sc.nextLong();
			}
			
			int i=0,j;
			while(i<n-1) {
				j = i+1;
				while(j<n) {
					if( (a[i] | a[j]) + (a[i] ^ a[j]) + (a[i] & a[j]) == (k + a[j]) ) res++;
					j++;
				}
				i++;
			}
			
			System.out.println(res);
		}
	}
}
