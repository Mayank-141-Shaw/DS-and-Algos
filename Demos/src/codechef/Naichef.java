package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Naichef {
	
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0) {
            t--;
            int n= sc.nextInt();
            int a= sc.nextInt();
            int b= sc.nextInt();
            double z=0;
            double nA=0;
            double nB=0;
            for (int i=0;i<n;i++){
                z= sc.nextDouble();
                if(z==a)nA++;
                if(z==b)nB++;
            }

            System.out.println((nA/n)*(nB/n));
        }
		
		
	}
	
}
