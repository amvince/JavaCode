import java.util.*;

// Sample Question 4a - Calculate the radius given the area

public class Question4a {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, radius;
		
		System.out.println("Enter area of circle");

		// The following code makes sure that we are taking a DOUBLE for the area.
		if (sc.hasNextDouble()) {
			area = sc.nextDouble();
		} else {
			while (!sc.hasNextDouble()) {
				System.out.println("Please enter a numerical value.");
				sc.next();
			}
			area = sc.nextDouble();			
		}
		
		radius = Math.sqrt(area / Math.PI);
		System.out.println("The radius of the circle is: " + radius);
    }
}
