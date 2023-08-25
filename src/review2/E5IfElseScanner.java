package review2;

import java.util.Scanner;

public class E5IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter your age to calculate the discount");
        int age= scanner.nextInt();// use this so that you can get the answer by the system box
        /*
        if age is grater than 60 offer 20% discount
        if age is greater than 50 offer 15% discount
        if age is greater than 40 offer 10 discount
        no discount
         */
        if(age>60){
            System.out.println("you get 20% discount");
        }else if(age>50){
            System.out.println("you get 15% discount");
        }else if(age>40){
            System.out.println("you get 10% discount");
        }else {
            System.out.println("no discount for you. please try after 10 years");
        }

    }
}
