package codechef.contest;

import java.util.Scanner;

public class Pathpar {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			
			if(n%2 == 0 || (n%2==1 && k==1)) System.out.println("YES");
		    else System.out.println("NO");
			
		}
	}
}
