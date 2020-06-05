import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What was your test out of?");
		double total = sc.nextInt();
		System.out.println("What mark did you get?");
		double mark = sc.nextInt();
		
		int grade =(int)(mark/total*100);
		
		if (grade<0 || grade>100) {
			System.out.println("That's not possible. Quit joking around.");
		} else if (grade >=86) {
			System.out.println("Contratulations, you got "+grade+"%. That's an A");
		} else if (grade>=73) {
			System.out.println("You got "+grade+"%. That's a B");
		} else if (grade>=67) {
			System.out.println("You got "+grade+"%. That's a C+");
		} else if (grade>=60) {
			System.out.println("You got "+grade+"%. That's a C");
		} else if (grade>=50) {
			System.out.println("You got "+grade+"%. That's a C-");
		}else  {
			System.out.println("You got "+grade+"%. You need to try harder");
		}	
	}
}
