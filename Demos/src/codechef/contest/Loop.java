package codechef.contest;

import java.util.Scanner;

public class Loop {
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long m = sc.nextLong();
			
			if (Math.abs(a-b) <= m/2) {
				// go inside loop
				System.out.println(Math.abs(a-b));
			}else {
				// go outside loop
				if(a < b) {
					System.out.println(Math.abs(a)+Math.abs(m-b));
				}else if(a==b) {
					System.out.println(0);
				}else {
					System.out.println(Math.abs(b)+Math.abs(m-a));
				}
			}
		}
	}
}
