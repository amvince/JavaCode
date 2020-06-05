import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = "dragon";
		
		System.out.println("What's the password?");
		
		String input = sc.next();
		
		if (input == password) {
			System.out.println("Correct! My secret is: I am Batman");
		} else {
			System.out.println("Incorrect Password! My secret is still safe...");
		}
	}
}
