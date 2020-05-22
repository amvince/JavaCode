import java.util.*;

public class CharCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
        
		System.out.print("Enter your sentence: ");
        String sentence = sc.nextLine();
        tally(sentence, charCount);

        Integer maxCount = 0;
        Character maxChar = null;

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("The character " + maxChar + " appears the most at " + maxCount + " times.");
    }

    public static void tally(String str, HashMap<Character, Integer> charCount) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer n = charCount.get(c);
            if (n == null) charCount.put(c, 1);
            else charCount.put(c, n+1);
        }
    }
}
