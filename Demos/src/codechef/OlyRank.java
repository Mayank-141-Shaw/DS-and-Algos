package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OlyRank {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int g1 = Integer.parseInt(s[0]);
			int s1 = Integer.parseInt(s[1]);
			int b1 = Integer.parseInt(s[2]);
			int g2 = Integer.parseInt(s[3]);
			int s2 = Integer.parseInt(s[4]);
			int b2 = Integer.parseInt(s[5]);
			
			if(g1+s1+b1 > g2+s2+b2) res[i] = 1;
			else res[i] = 2;
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
