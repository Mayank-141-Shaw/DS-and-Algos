import java.util.Scanner;
public class Duck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String s = sc.nextLine();
		int len = s.length();
		int c0 = 0;
		char ch;
		
		for(int i=1; i<len; i++) {
			ch = s.charAt(i);
			if(ch=='0') c0++;
		}
		
		char first = s.charAt(0);
		if(first!='0' && c0 > 0) System.out.println("Its a duck number");
		else System.out.println("Not a duck number");
	}
}
