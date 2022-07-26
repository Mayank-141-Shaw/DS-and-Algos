package codechef;

import java.util.Scanner;

public class Flow005 {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {100, 50, 10, 5, 2, 1};
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			
			int notes = 0;
			int i = 0;
			while(n > 0 && i<6) {
				if(n >= arr[i]) {
					notes += n / arr[i];
					n = n % arr[i];
				}
				i++;
			}
			
			System.out.println(notes);
		}
	}
}
