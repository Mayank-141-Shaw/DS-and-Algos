package codechef;

import java.io.IOException;
import java.io.*;

public class LazyChf {
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] res = new int[t];
		
		for(int i=0; i<t; i++) {
			String[] xmd = br.readLine().trim().split(" ");
			int x = Integer.parseInt(xmd[0]);
			int m = Integer.parseInt(xmd[1]);
			int d = Integer.parseInt(xmd[2]);
			
			res[i] = Math.min(x*m, x+d);
		}
		
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}
