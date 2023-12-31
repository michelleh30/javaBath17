package replitHw6;

import java.util.Scanner;

/*Write code that will take in a String input and check to see if it is a palindrome or not.

A palindrome means that the characters are the same forwards and backwards, **ignoring spaces.**

Examples of palindromes:

- racecar
- was it a car or a cat I saw
- never odd or even
- rats live on no evil star

Your check should be case insensitive too.  For example, "Bob" is a palindrome, despite the first B being capitalized.

Your program will print out "true" if it's a palindrome and "false" if not.

DONT UNDERSTAND
 */
public class Hw99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();

        String replaceAllString=givenString.replaceAll(" ","").toLowerCase();
        boolean result=false;

        int i=0;
        int j=replaceAllString.length()-1;
        while(i<=j){

            if(replaceAllString.charAt(i) == replaceAllString.charAt(j)){
                result=true;
            }else{
                break;
            }
            i++;
            j--;
        }
        System.out.print(result);

    }
}


