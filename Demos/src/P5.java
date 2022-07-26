import java.util.Scanner;
public class P5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x value : ");
		float x = sc.nextFloat();
		float S = 0;
		for(int i = 2; i<=20; i+=3) {
			S = S + x/i;
		}
		System.out.println("Sum = "+S);
	}
}
