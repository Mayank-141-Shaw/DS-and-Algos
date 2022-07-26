package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class GoodWeat {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int ct = 0;
			
			for(int j=0; j<7; j++) ct += Integer.parseInt(s[j]);
			
			if(ct >= 4) res[i] = "YES";
			else res[i] = "NO";
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
