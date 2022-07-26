package codechef;

import java.io.IOException;
import java.io.*;

public class RcbPlay {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] xyz = br.readLine().trim().split(" ");
			int x = Integer.parseInt(xyz[0]);
			int y = Integer.parseInt(xyz[1]);
			int z = Integer.parseInt(xyz[2]);
			
			if( (x + (z*2) ) >= y) res[i] = "YES";
			else res[i] = "NO";
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
