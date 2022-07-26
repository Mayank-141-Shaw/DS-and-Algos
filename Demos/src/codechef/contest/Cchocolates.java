package codechef.contest;

import java.util.Scanner;

public class Cchocolates {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			int res = (10*y + 5*x) / z;
			System.out.println(res);
		}
	}
}
