package codechef;

import java.util.Scanner;

public class Xystr {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0){
		    String s = sc.next();
		    int i=0, res = 0;
		    int n = s.length();
		    while(i+1 < n){
		        char ll = s.charAt(i);
		        char rr = s.charAt(i+1);
		        if((ll=='x' && rr=='y') || (ll=='y' && rr=='x')){
		            // its a pair
		            res++;
		            i = i+2;
		        }else{
		            i++;
		        }
		    }
		    System.out.println(res);
		}
	}
}
