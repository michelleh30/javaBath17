package projectCodes2;
/*
Reverse a String: Write a function to reverse a given string. For example given the input "Hello",
, the output should be "olleH"
 */
public class Task2 {
    public static void main(String[] args) {

        String word="Hello";
        for (int i = word.length()-1; i>=0 ; i--) {
            System.out.print(word.charAt(i)+"");

        }

    }
}
