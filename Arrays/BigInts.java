import java.util.Scanner;
import java.util.ArrayList;

// BigInts
// Given that the integer class has a "biggest number" this class
// simulates adding very large numbers.
// This file contains a number of added functions for learning purposes.
// There is a way to streamline this.

public class BigInts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstBulk, secondBulk;
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		System.out.println("First Number: ");
		firstBulk = sc.next();
		first = parse(firstBulk);
		System.out.println("Second Number: ");
		secondBulk = sc.next();
		second = parse(secondBulk);
		sc.close();
		
		result = add(first, second);
		display(first);
		System.out.print(" + ");
		display(second);
		System.out.print(" = ");
		display(result);
	}
	
	public static void display(ArrayList<Integer> value) {
		for (Integer i : value) {
			System.out.print(i);
		}
	}
	
	public static ArrayList<Integer> parse(String temp) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(char c : temp.toCharArray()) {
			result.add(Character.getNumericValue(c));
		}
		return result;
	}
	
	public static ArrayList<Integer> add(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int carry = 0;
		int endA = a.size()-1, endB = b.size()-1;
		int sum;
		
		while (endA >=0 || endB >=0) {
			if (endA >=0 && endB >=0) {
				sum = a.get(endA) + b.get(endB) + carry;
			} else if (endA >= 0) {
				sum = a.get(endA) + carry;
			} else if (endB >= 0) {
				sum = b.get(endB) + carry;
			} else sum = carry;
			
			if (sum>9) {
				carry = 1;
				sum = sum % 10;
			} else carry=0;
			result.add(0, sum);
			endA--;
			endB--;
		}
		if (carry>0) result.add(0, carry);
		return result;
	}
}
