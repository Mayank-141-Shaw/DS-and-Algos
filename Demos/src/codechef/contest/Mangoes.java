package codechef.contest;

import java.util.Scanner;

public class Mangoes {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if(z-y == 0) {
				System.out.println(0);
			}else {
				System.out.println(Math.floorDiv(z-y, x));
			}
		}
	}
}
