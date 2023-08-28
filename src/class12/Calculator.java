package class12;

import java.util.Scanner;

public class Calculator {

    void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();
        System.out.println("please enter the second number");
        int num2=scanner.nextInt();
        int sum=num1+num2;
        System.out.println("sum of these number is "+sum);


    }
    void subtract(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();
        System.out.println("please enter the second number");
        int num2=scanner.nextInt();
        int sum=num1-num2;
        System.out.println("subtraction of these number is "+sum);
    }

    void multiply(int num1,int num2){

        int result=num1*num2;
        System.out.println(result);
    }


}
