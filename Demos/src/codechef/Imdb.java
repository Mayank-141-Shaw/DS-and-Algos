package codechef;

import java.io.IOException;
import java.util.*;

public class Imdb {
	
	public static void main(String args[]) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		
		
		int t = sc.nextInt();
		while(t-- >0) {
			int num=0;
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    for(int i=0;i<n;i++){
		        int s=sc.nextInt();
		        int r=sc.nextInt();
		        if(s<=x)
		            num=Math.max(num,r);
		    }
		    System.out.println(num);
		}
	}
}
