package codechef;

import java.io.*;

public class Ramdev {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = br.readLine().trim().split(" ");
		long l = Long.parseLong(s[0]);
		long b = Long.parseLong(s[1]);
		
		int N = Integer.parseInt(br.readLine());
		
		
		long ct = 0;
		
		for(int i=0; i<N; i++) {
			s = br.readLine().trim().split(" ");
			long ll = Long.parseLong(s[0]);
			long bb = Long.parseLong(s[1]);
			
			ct += Math.max( (ll/l)*(bb/b), (ll/b)*(bb/l));
		}
		
		System.out.println(ct);
		
		
	}
	
	
	
	
	
}
