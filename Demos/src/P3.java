import java.util.Scanner;
import java.util.regex.*;
public class P3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		String firstName = name.substring(0, name.indexOf(' '));
		System.out.println("Hello "+firstName);
	}
}
