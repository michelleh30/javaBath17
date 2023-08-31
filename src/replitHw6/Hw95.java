package replitHw6;

import java.util.Scanner;

//Using Scanner class input string value.
//
//Print out the following: "The first 3 letters of \_\_\_ is ___"
//
//```
//For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
public class Hw95 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter a word");
        String word= scanner.nextLine();

        String letter=word.substring(0,3);
        System.out.println("The first 3 letters of "+word+" is "+letter);


    }
}
