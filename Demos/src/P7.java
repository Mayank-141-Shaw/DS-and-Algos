import java.util.Scanner;
public class P7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		// get sum of digits
		int s = 0, dig, n1 = num;
		while(n1 > 0) {
			dig = n1 %10;
			s += dig;
			n1 /= 10;
		}
		if(num%s == 0) System.out.println("Its a Niven number");
		else System.out.println("Not a Niven number");
	}
}
