package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Threeq {
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] s = br.readLine().trim().split(" ");
			
			int a1 = Integer.parseInt(s[0]);
			int a2 = Integer.parseInt(s[1]);
			int a3 = Integer.parseInt(s[2]);
			
			s = br.readLine().trim().split(" ");
			
			int b1 = Integer.parseInt(s[0]);
			int b2 = Integer.parseInt(s[1]);
			int b3 = Integer.parseInt(s[2]);
			
			if(a1+a2+a3 == b1+b2+b3) res[i] = "Pass";
			else res[i] = "Fail";
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
		
		
	}
}
