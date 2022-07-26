package dp;

import java.util.Scanner;

public class Fibonacci {
	
	static int[] dp = new int[1000];
    
    public static void main(String[] args) throws Exception{
    	
      Scanner sc = new Scanner(System.in);
		  int s = sc.nextInt();
		  //System.out.println(fib(s));
		  //System.out.println(fibTab(s));
		  System.out.println(optimized(s));
    }
  
    static int fib(int n){
	    if(n==1 || n==0) return n;
	    
	    if(dp[n] > 0) return dp[n];
	    
	    dp[n] = fib(n-1)+fib(n-2);
	    return dp[n];
	  } 
  
    static int fibTab(int n){
	    int[] dd = new int[n+1];
	    dd[0] = 0;
	    dd[1] = 1;
	    if(n <= 1) return dd[n];
	    
	    for(int i=2; i<=n; i++){
	      dd[i] = dd[i-1] + dd[i-2];
	    }
	    return dd[n];
	  }  
	  
    static int optimized(int n){
	    if(n<=1) return n;
	    int prev1=1, prev2=0;
	    int cur=0;
	    for(int i=2; i<=n; i++){
	      cur = prev1 + prev2;
	      prev2 = prev1;
	      prev1 = cur;
	    }
	    return cur;
	  }  
}
