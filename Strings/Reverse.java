/**
 * Reverse String
 *
 */
public class Reverse 
{
    public static void main( String[] args )
    {
        reverseString();
    }

    public static void reverseString() {
        String forward = "Welcome To My World";
        String reverse = "";

        for(int i=forward.length()-1; i>=0; i--) {
            reverse += forward.charAt(i);
        }
        System.out.println(forward);
        System.out.println(reverse);
    }
}
