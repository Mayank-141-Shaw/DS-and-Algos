package codechef;

import java.util.Scanner;

public class Adacra {
	
	public static void main(String args[]) throws Exception{
	
		// your code goes here
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				
				while(t-- > 0){
				    String s = sc.next();
				    int n = s.length();
				    int u=0, d=0;
				    int i=0,j=0;
				    char prev = s.charAt(0);
				    if(prev == 'U') u=1;
				    else d=1;
				    
				    while(i<n && j<n){
				        // inside a window
				        char cur= s.charAt(j);
				        if(cur == 'U'){
				            if(cur == prev){
				                // maintain the window
				                j++;
				            }else{
				                // shift the window and increase the count
				            	prev = s.charAt(j);
				                i=j;
				                j++;
				                u++;
				            }
				            // maintain the 
				        }else{
				            if(cur == prev){
				                j++;
				            }else{
				            	prev = s.charAt(j);
				                i=j;
				                j++;
				                d++;
				            }
				        }
				        
				        // System.out.println("U : "+u+", D : "+d);
				    }
				    
				    if(u >= d){
			           // flip down
			           System.out.println(d);
				    }else{
				        // flip up
				        System.out.println(u);
				    }
				}
	}
}
