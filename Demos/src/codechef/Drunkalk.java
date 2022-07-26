package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Drunkalk {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			
			int k = Integer.parseInt(br.readLine());
			
			if(k%2==0) res[i] = k;
			else res[i] = k+2;
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
