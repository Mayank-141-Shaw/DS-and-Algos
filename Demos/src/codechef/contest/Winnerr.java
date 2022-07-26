package codechef.contest;

import java.util.Scanner;

public class Winnerr {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int pa = sc.nextInt();
			int pb = sc.nextInt();
			int qa = sc.nextInt();
			int qb = sc.nextInt();
			
			int p = Math.max(pa,  pb);
			int q = Math.max(qa, qb);
			
			if(p > q) System.out.println("Q");
			else if(p < q) System.out.println("P");
			else System.out.println("TIE");
			
			
		}
	}
}
