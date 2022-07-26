import java.util.Scanner;
public class P10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			System.out.println("Enter 1 to enter a number \n"+
					"Enter 2 to check if number is prime \n"+
					"Enter 3 to check if number is automorphic \n"+
					"Enter 4 to exit \n"+
					"Enter your choice");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter a number ");
					num = sc.nextInt();
					break;
			case 2:	// check prime
					int ct = 0;
					for(int i=1; i<=num; i++) {
						if(num%i == 0) ct+=1;
					}
					if(ct == 2) System.out.println(num + " is a prime numbber");
					else System.out.println(num + " is not a prime numbber");
					break;
			case 3: // check automorphic number
					int square = num * num;
					// count number of digits
					String str_num = Integer.toString(num);
					String sq_num = Integer.toString(square);
					if(sq_num.endsWith(str_num)) System.out.println(num + " is Automorphic Number");
					else System.out.println(num + " is not an Automorphic Number");
					break;
			case 4: System.out.println("Terminated");
					System.exit(0);
					break;
			default: System.out.println("Wrong choice, Try again");
			}
		}
	}
}
