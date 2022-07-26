import java.util.Scanner;
public class P8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int s=0,p=1, dig, n1=num;
		while(n1 > 0) {
			dig = n1 %10;
			s += dig;
			p *= dig;
			n1 /= 10;
		}
		if(p == s) System.out.println("Its a spy number");
		else System.out.println("Not a spy number");
	}
}
