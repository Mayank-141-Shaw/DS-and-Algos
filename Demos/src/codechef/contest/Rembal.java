package codechef.contest;

import java.util.Scanner;

public class Rembal {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		long t = sc.nextLong();
		int i=0, j=0;
		int top = -1;
		
		while(t-- > 0) {
			String s = sc.nextLine();
			
			s = sub(s);
		}
	}
	
	public static String sub(String s) {
		int l = s.length();
		int i=0, j=0;
		int top=-1;
		boolean pop = false;
		while(j<l) {
			char ch = s.charAt(j);
			if(ch=='(') {
				if(top==-1) {
					top++;
					j++;
				}else {
					if(pop) {
						// break here
						 return "YES"; 
					}else {
						top++;
						j++;
					}
				}
				
			}else if(ch==')') {
				if(top==-1) {
					i++;
				}else {
					// pop
					pop = true;
					top--;
					j++;
				}
			}
		}
		return s;
	}
}
