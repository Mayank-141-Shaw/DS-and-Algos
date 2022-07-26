import java.util.Scanner;
public class P11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int se=0, so=0, dig, n1=num;
		while(n1 > 0) {
			dig = n1 % 10;
			// check if even or odd
			if(dig % 2 == 0) se += dig;
			else so += dig;
			n1 = n1 / 10;
		}
		if(so == se) System.out.println(num+" is a lead number");
		else System.out.println(num+" is not a lead number");
	}
}
