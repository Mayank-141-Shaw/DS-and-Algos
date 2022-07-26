package codechef;

import java.io.IOException;
import java.util.Scanner;

public class Num239 {
	
	public static void main(String args[]) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t>0) {
			t--;
			int ct = 0;
			
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			for(int i=l; i<=r; i++) {
				if(i%10 == 2 || i%10==3 || i%10==9) ct++;
			}
			System.out.println(ct);
		}
		
		
		
	}
}
