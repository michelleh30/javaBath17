package projectCodes1;
//Write a java program to check whether a given number is prime or not?

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter a number");
        int number= scanner.nextInt();

        if(number%2==0){
            System.out.println("This is not a prime number");
        }else{
            System.out.println("This is a prime number");
        }

    }
}
