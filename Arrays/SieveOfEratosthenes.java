import java.util.Scanner;
import java.util.ArrayList;

//Prime numbers using the Sieve of Eratosthenes method

public class SieveOfEratosthenes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("What is the maximum value of primes you want to list?");
		n = sc.nextInt();
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		// 1. Create an ArrayList containing all number from 2 to n
		for (int i = 2; i<=n; i++) {
			primes.add(i);
		}
		
		// 2. Start with p = 2, the first prime number
		int p = 2;
		
		while (primes.indexOf(p)<(primes.size()-1)) {
			// 3. remove all elements of the list that are multiples of p
			for (int i = p*p; i<=n; i+=p) {
				if (primes.contains(i)) primes.remove(primes.indexOf(i));	
			}
			// 4. Increment p to the next value in the ArrayList - this will be the next-lowest prime.
			p = primes.get(primes.indexOf(p)+1);
		}
		// 5. The while loop continues until p reaches the end of the list
		
		// 6. The "primes" ArrayList now contains only primes.

		// Print out the list.
		System.out.println(primes);
	}
}
