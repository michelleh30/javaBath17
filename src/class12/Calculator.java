package class12;

import java.util.Scanner;

public class Calculator {

    void add(){//add is the name of the method
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

    void multiply(int num1,int num2){//if you don't want to use scanner for a method you can do this, this is called parameters/input

        int result=num1*num2;//this is taking the input and calling the method
        System.out.println(result);

        //////this is hard coding b/c we have put the input already in it
        /*
        void multiply(){
        int number1=10;
        int number2=20;
        int result =number1*number2;
        System.out.println(result);
        }
         */
    }


}
