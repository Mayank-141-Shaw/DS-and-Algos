package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Carrygold {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int n = Integer.parseInt(s[0]);
			int x = Integer.parseInt(s[1]);
			int y = Integer.parseInt(s[2]);
			
			if((n+1)*y >= x) res[i] = "Yes";
			else res[i] = "No";
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
