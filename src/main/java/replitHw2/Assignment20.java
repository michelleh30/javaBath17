package replitHw2;

import java.util.Scanner;

//Write  a program that takes user's first name and last name and prints in console
//
//Instruct the user to enter first name: "Please Enter First Name"
//
//Capture the first name
//
//Instruct the user to enter last name:"Please Enter Last Name"
//
//Capture last name
//
//Print first name and last name
public class Assignment20 {
    public static void main(String[] args) {

        System.out.println("Please Enter Your First Name");

        Scanner input=new Scanner(System.in);
        String name = input.next();

        System.out.println("Please Enter Last Name");
        String last= input.next();

        System.out.println("Your name is "+name+" "+last);




    }
}
