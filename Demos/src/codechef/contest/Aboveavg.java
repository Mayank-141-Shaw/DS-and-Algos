package codechef.contest;

import java.util.Scanner;

public class Aboveavg {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextLong();
			long m = sc.nextLong();
			long x = sc.nextLong();
			
			if(m==x) {
				System.out.println(0);
			}else {
				System.out.println(n*x / (x+1));
			}
			
		}
	}
}
