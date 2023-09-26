package onesIDontKnow;

public class Q6Project2 {
    public static void FirstNonRepeat(String str) {
        for (int i = 0; i < str.length(); i++) {

/* one: str.indexOf(str.charAt(i) is to search the first occurrence of a character in the string
   two: str.indexOf(str.charAt(i)) + 1 is to search for the same character starting from the position immediately after
   its first occurrence
   three: == -1 means that there is no further occurrence of the character or in other word the character is the first
   non-repeating character of the string*/

            if (str.indexOf(str.charAt(i), str.indexOf(str.charAt(i)) + 1) == -1) {
                System.out.println("The first non-repeating character is '" + str.charAt(i) + "'.");
                return;
            }
        }
        System.out.println("There are not any non-repeating character in this string.");
    }

    public static void main(String[] args) {
        String s = "abracadabra";
        FirstNonRepeat(s);
    }
}
