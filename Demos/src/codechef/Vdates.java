package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vdates {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int d = Integer.parseInt(s[0]);
			int l = Integer.parseInt(s[1]);
			int r = Integer.parseInt(s[2]);
			
			if(d < l) res[i] = "Too Early";
			else if(d > r) res[i] = "Too Late";
			else res[i] = "Take second dose now";
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
