package codechef.contest;

import java.util.Scanner;

public class Minheight {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int x = sc.nextInt();
			int h = sc.nextInt();
			
			if(x>=h) System.out.println("YES");
			else System.out.println("No");
		}
	}
}
