package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Visa {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			int x1 = Integer.parseInt(s[0]);
			int x2 = Integer.parseInt(s[1]);
			int y1 = Integer.parseInt(s[2]);
			int y2 = Integer.parseInt(s[3]);
			int z1 = Integer.parseInt(s[4]);
			int z2 = Integer.parseInt(s[5]);
			
			if(x2 >= x1 && y2 >= y1 && z2 <= z1) res[i] = "Yes";
			else res[i] = "No";
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
