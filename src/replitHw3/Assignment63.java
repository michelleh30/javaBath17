package replitHw3;

import java.util.Scanner;

//Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user), exclusive.
public class Assignment63 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();

        for (int i = 0; i <input; i++) {
            System.out.print(i+" ");

        }

    }
}
