package codechef;

import java.io.IOException;
import java.io.*;

public class PassOrFail {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		String[] res = new String[t];
		
		for(int i=0; i<t; i++) {
			String[] nxp = br.readLine().trim().split(" ");
			int n = Integer.parseInt(nxp[0]);
			int x = Integer.parseInt(nxp[1]);
			int p = Integer.parseInt(nxp[2]);
			
			// 3 marks for each correct , -1 for each incorrect
			if( ((x*3)+( (n-x) * -1 )) >= p) res[i] = "PASS";
			else res[i] = "FAIL";
		}
		
		//printing
		for(int i=0; i<t; i++) {
			System.out.println(res[i]);
		}
	}
}

