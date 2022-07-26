package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mararun {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int D = Integer.parseInt(s[0]);
			int d = Integer.parseInt(s[1]);
			int a = Integer.parseInt(s[2]);
			int b = Integer.parseInt(s[3]);
			int c = Integer.parseInt(s[4]);
			
			int pp = d*D;
			
			if(pp >= 42) res[i] = 3;
			else if(pp >= 21 && pp < 42) res[i] = 2;
			else if(pp < 10) res[i] = 0;
			else res[i] = 1;
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
