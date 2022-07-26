package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Frgame {
	
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			t--;
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			if (a >= b) b += c;
			else a+= c;
			
			if (a >= b) b += d;
			else a+= d;
			
			if( a>= b) System.out.println("N");
			else System.out.println("S");
			
		}
		
		
		
	}
}
