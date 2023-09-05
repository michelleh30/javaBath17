package replitHw2;

import java.util.Scanner;

//Write a program that takes a user's name and prints it.
public class Assignment24 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Hello, please enter your name");
        String name= scanner.next();

        System.out.println("Your name is "+name);

    }
}
