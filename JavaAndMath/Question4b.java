import java.util.*;

// Sample Question 4b - Calculate distance between two points

public class Questions4b {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2, dist;		

		// The following uses a created function "getPoint" to streamline input and check
		// to make sure that we are receiving an double for our math.
		x1 = getPoint("Enter the X of the first point.", sc);
		y1 = getPoint("Enter the Y of the first point.", sc);
		x2 = getPoint("Enter the X of the secondpoint.", sc);
		y2 = getPoint("Enter the Y of the second point.", sc);

		// We will use the Math.sqrt and Math.pow methods to "simplify" the math.
		dist = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
		
		// I did this on two lines so we could see all the code on the same screen.
		// You could have done a single "println" if you wish.
		
		System.out.print("The distance between points ("+x1+","+x2+") and (");
		System.out.println(y1+","+y2+") is " + dist);
    }
	
	private static double getPoint(String message, Scanner sc) {
		double point;
		System.out.println(message);
		if (sc.hasNextDouble()) {
			point = sc.nextDouble();
		} else {
			while (!sc.hasNextInt()) {
				System.out.println("Please enter a numerical value.");
				sc.next();
			}
			point = sc.nextDouble();			
		}

		return point;
	}
}
