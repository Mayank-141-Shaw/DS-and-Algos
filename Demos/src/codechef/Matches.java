package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matches {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int a,b;
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
			res[i] = 0;
			
			int sum = a+b;
			int dig = 0;
			while(sum > 0) {
				dig = sum % 10;
				if(dig == 1) res[i] += 2;
				else if(dig == 7) res[i] += 3;
				else if(dig == 4) res[i] += 4;
				else if(dig == 2 || dig==3 || dig == 5) res[i] += 5;
				else if(dig == 0 || dig==6 || dig == 9) res[i] += 6;
				else if(dig == 8) res[i] += 7;
				
				sum /= 10;
			}
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
