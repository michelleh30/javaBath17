package class11;

import java.util.Scanner;

//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter mothers first name");
        String momName = scanner.nextLine();

        System.out.println("Please enter fathers first name");
        String dadName = scanner.nextLine();

        System.out.println("baby boy or baby girl?");
        String gender = scanner.nextLine();

        if (gender.equals("boy")) {
            String boysName = dadName.substring(0, dadName.length() / 2) + momName.substring(momName.length() / 2);
            System.out.println(boysName);
        } else if (gender.equals("girl")) {
            String girlsName = momName.substring(0, momName.length() / 2) + dadName.substring(dadName.length() / 2);
            System.out.println(girlsName);
        } else {
            System.out.println("Invalid input");
        }

    }


}

