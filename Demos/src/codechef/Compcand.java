package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Compcand {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			long n = Long.parseLong(s[0]);
			long k = Long.parseLong(s[1]);
			
			if(Math.floorMod(n, k) != 0) res[i] = -1;
			else res[i] = (int)Math.floorDiv(n, k);
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
