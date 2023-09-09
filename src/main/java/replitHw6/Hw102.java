package replitHw6;
/*Write a for loop that will loop through every character of a word and print out each character,
each on a separate line

 Sample inputs/outputs:

```
In: hello
h
e
l
l
o

 */
public class Hw102 {
    public static void main(String[] args) {
        String a="hello";
        for (int i = 0; i <a.length() ; i++) {
            System.out.println(a.charAt(i));

        }

    }
}
