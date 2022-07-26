package codechef.contest;

import java.util.Scanner;

public class Prefxor {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		
		while(t-- > 0) {
			long k = sc.nextLong();
			int x = sc.nextInt();
			
			if(k==0) {
				System.out.println(x);
			}else {
				int[] arr = new int[x];
				arr[0] = 1;
				
				while(k>0) {
					for(int i=1; i<x; i++) {
						arr[i] = arr[i-1] ^ (i+1);
					}
					k--;
				}
				System.out.println(arr[x-1]);
			}
		}
	}
}
