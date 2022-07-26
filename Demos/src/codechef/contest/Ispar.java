package codechef.contest;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Ispar {
	
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			long n = sc.nextLong();
		    long k = sc.nextLong();
		    
		    if(k==1){
		        if(n%2==0) System.out.println("EVEN");
		        else System.out.println("ODD");
		    }else if(k==2){
		        System.out.println("ODD");
		    }else{
		        System.out.println("EVEN");
		    }
		}
	}
}
