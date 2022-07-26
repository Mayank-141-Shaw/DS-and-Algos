package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ccisland {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int xr = Integer.parseInt(s[2]);
			int yr = Integer.parseInt(s[3]);
			int d = Integer.parseInt(s[4]);
			
			if(x/xr >= d && y/yr >= d) res[i] = "Yes";
			else res[i] = "No";
			
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
