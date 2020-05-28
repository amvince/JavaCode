// Sample Question 4d - Simple dice roller
// Rolls one six sided dice ten times.

public class Question4d {
	public static void main(String[] args) {
		
		// These variables have been set up to make this program more dynamic. At this moment,
		// Total "rolls" is ten
		// A single die will roll a "max" value of six
		// value is the value of each roll. Currently, this changes every time.
		
		int rolls=10, max = 6, value;
		
		
		for (int i = 0; i<rolls; i++) {
			/* in the following line, we have two main processes.
			   First, Math.random creates a random double between 0 and .99999. This is then
			   multiplied by 6 to give 0 to 5.99999. We add 1 to this value because when we do
			   the second part, and cast it as an integer, it truncates the decimal leaving us
			   with a value between 1 and 6. */
			value = (int)( Math.random()*max + 1);
			System.out.println(value);

		}
	}
}
