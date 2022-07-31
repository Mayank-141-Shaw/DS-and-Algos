package codechef;

import java.util.Scanner;

public class Insurance {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    
		    if( y > x ) System.out.println(x);
		    else System.out.println( y );
		}
	}
}
