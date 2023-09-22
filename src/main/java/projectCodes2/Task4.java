package projectCodes2;

/*
Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

int count = str.length();
        System.out.println(count);
        count how many letters
 */
public class Task4 {

    public static void main(String[] args) {

        String str = "Hello, world!";
        String [] strs=str.split("[,]");

        System.out.println(strs.length);

    }


}
