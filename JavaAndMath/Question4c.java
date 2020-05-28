import java.util.*;

// Sample Question 4c - Simple interest rate calculation

public class Question4c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, p, r, n;		

		// The following uses a created function "getValue" to streamline input and check
		// to make sure that we are receiving an double for our math.
		p = getValue("What is the Principle of the loan?", sc);
		r = getValue("What is the percentage rate (decimal) of the loan per year?", sc);
		n = getValue("What is the year-length of the loan?", sc);
		

		// We will use the Math.pow methods to "simplify" the math.
		A = p * Math.pow((1+r),n);
		
		// In this example, we use the String.format tool. This will allow us to format our
		// double to only show a certain number of decimals - in this case, two decimals.
		
		System.out.println("The total amount of the loan is: "+ String.format("%.2f", A));
		System.out.println("You have paid a total of "+String.format("%.2f", (A-p))+" in interest.");
    }
	
	// Similar to previous examples, we are making a "getValue" helper to validate our input.
	private static double getValue(String message, Scanner sc) {
		double value;
		System.out.println(message);
		if (sc.hasNextDouble()) {
			value = sc.nextDouble();
		} else {
			while (!sc.hasNextInt()) {
				System.out.println("Please enter a numerical value.");
				sc.next();
			}
			value = sc.nextDouble();			
		}

		return value;
	}
}
