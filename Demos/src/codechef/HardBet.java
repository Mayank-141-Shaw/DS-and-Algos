package codechef;

import java.io.IOException;
import java.io.*;

public class HardBet {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] abc = br.readLine().trim().split(" ");
			int a = Integer.parseInt(abc[0]);
			int b = Integer.parseInt(abc[1]);
			int c = Integer.parseInt(abc[2]);
			
			if(a < b && a < c) res[i] = "DRAW";
			else if(b < a && b < c) res[i] = "BOB"; 
			else res[i] = "ALICE"; 
		
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
