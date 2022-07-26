package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Can_reach {
	
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int x,y,k;
		
		while(t>0) {
			x = sc.nextInt();
			y = sc.nextInt();
			k = sc.nextInt();
			x = Math.abs(x);
			y = Math.abs(y);
			
			if(x%k == 0 && y%k==0) System.out.println("Yes");
			else System.out.println("No");
			t--;
		}
		
		
		
	}
}
