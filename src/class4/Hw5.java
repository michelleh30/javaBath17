package class4;

import java.util.Scanner;

//Write a program to ask user to enter numbers of worked years and annual salary.
//If user worked for more or equals to 5 years than user is eligible for the bonus,
//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000,
//otherwise bonus=3000.
public class Hw5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many years have you work");
        int years= scanner.nextInt();

        if (years>=5){
            System.out.println("You are eligible for a bonus!");
        }else{
            System.out.println("Sorry, you are not eligible");
        }
        double salary= scanner.nextDouble();
        if (salary>50000){
            System.out.println("Your bonus is $5000");
        }else{
            System.out.println("Your bonus is $3000");
        }
    }
}
