package codechef;

import java.util.Scanner;

public class PrizePool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    System.out.println( 10*x + 90*y );
		}
	}

}
