package replitHw3;

import java.util.Scanner;

//int x;
//```
//
//Write a for loop that will print out a series of numbers starting at one less than x and ending at 0.
public class Assignment65 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();

        for (int i = input- 1; i >= 0; i--) {
            System.out.print(i+" ");
        }
    }
}

