package projectCodes2;

/*
Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome.
 */
public class Task3 {
    public static void main(String[] args) {

        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);

        }
        if (str.equals(reverse)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }


    }
}
