package codechef.contest;

import java.util.Scanner;

public class Cbspeed {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(y > x) System.out.println("YES");
		else System.out.println("NO");
	}
}
