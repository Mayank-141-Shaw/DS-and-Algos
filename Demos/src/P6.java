import java.util.Scanner;
public class P6 {
	public static void main(String args[]) {
		System.out.println("Enter a 2 digit number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// get 2 digits
		int p = num /10;
		int q = num %10;
		int sum = p+q;
		int prod = p*q;
		int result = sum + prod;
		if(result == num) System.out.println("It is Sprime number");
		else System.out.println("Not a sprime number");
	}
}
