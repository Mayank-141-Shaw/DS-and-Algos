package codechef;

import java.util.Scanner;

public class Burgers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int n = sc.nextInt();
		    int r = sc.nextInt();
		    
		    
		    if(n*x > r) System.out.println(-1);
		    else if( n*y < r ) System.out.println(0 + " " + n);
		    else{
		        int prem = (r - (n*x))/(y-x);
		        prem = Math.min(prem, n);
		        System.out.println( (n-prem) + " " + prem);
		    }
		}
	}

}
