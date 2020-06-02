import java.util.Scanner;
import java.util.ArrayList;

// Goldbach Conjecture
// Every even number above two can be made up of two prime numbers.
// This will print out one pair of primes.

public class GolbachConjecture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("What is the Even Number you wish to find the prime-sum of?");
		n = sc.nextInt();
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		// First, we will create the list of primes up to our number.
		for (int i = 2; i<=n; i++) {
			primes.add(i);
		}
		
		int p = 2;
		
		while (primes.indexOf(p)<(primes.size()-1)) {
			for (int i = p*p; i<=n; i+=p) {
				if (primes.contains(i)) primes.remove(primes.indexOf(i));	
			}
			p = primes.get(primes.indexOf(p)+1);
		}

		// Next, we will look through this list for the first prime-pair.
		// Here is where I mean, "can you do this with one loop."
		for (Integer x : primes) {
			if (primes.contains(n-x)) {
				System.out.println(x + " + "+ (n-x) + " = " + n);
				break;
			}
		}
	}
}

