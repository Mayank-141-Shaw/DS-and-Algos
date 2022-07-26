import java.util.Scanner;
public class P9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("Enter 1 to enter a number \nEnter 2 to check palindrome for the number \n"+
					"Enter 3 to exit \nEnter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter a number ");
					num = sc.nextInt();
					break;
			case 2:	// check palindrome
					int dig, rev=0, n1=num;
					while(n1>0) {
						dig = n1%10;
						rev = rev*10 + dig;
						n1 = n1/10;
					}
					if(num == rev) System.out.println(num + " is a palindrome numbber");
					else System.out.println(num + " is not a palindrome numbber");
					break;
			case 3: System.out.println("Terminated");
					System.exit(0);
					break;
			default: System.out.println("Wrong choice, Try again");
			}
		}
	}
}
