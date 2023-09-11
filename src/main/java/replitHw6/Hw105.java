package replitHw6;

import java.util.Scanner;

//There is a code that takes input as a String.
//
//Write a program that will print out only vowels of that string
//
//Sample input/outputs:
//
//```
//In: howdyho
//oo
public class Hw105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        for (int i = 0; i <word.length() ; i++) {
            if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u'){
                System.out.println(i);
            }else{
                System.out.println();
            }
            
        }


    }
}
