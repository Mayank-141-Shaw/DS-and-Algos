package codechef.contest;

import java.util.Scanner;

public class Increar {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			
			long step = 0;
			
			if(x > y) {
				long d = x-y;
				step += d/2;
				d = Math.floorMod(d, 2);
				y += ((x-y)-d);
				if(d == 1) {
					step+=2;
				}
			}
			else if(y > x) {
				long d = y-x;
				step += d;
			}
			
			System.out.println(step);
		}
	}
}
