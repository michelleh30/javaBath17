package replitHw2;

import java.util.Scanner;

//Write a program to take user name, age and mobile number
//
//First Output: "Enter your name"
//
//Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)
//
//Third Output: "Enter your age"
public class Assignment22 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.next();


        System.out.println("Enter your mobile number");
        String number=scanner.next();

        System.out.println("Enter your age");
        String age=scanner.next();

        System.out.println("Your name is,"+name+" your age is "+age+" and your mobile number is "+number);

    }
}
