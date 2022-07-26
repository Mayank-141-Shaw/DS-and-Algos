package codechef;

import java.util.Scanner;

public class Cielrcpt {
	
	public static void main(String args[]) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int[] menu = {2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
		
		while(t-- > 0) {
			int p = sc.nextInt();
			
			int i=0, res = 0;
			while(i<12 && p>0) {
				if(menu[i] <= p) {
					res += p / menu[i];
					p = p % menu[i];
				}
				i++;
			}
			
			System.out.println(res);
		}
	}
}
