package class5;

import java.util.Scanner;

//Using scanner class create calculator.
// Allow user to enter 2 numbers and operator(+,-,*,/).
// Based on operator provide the result to user.
//Please complete this assignment in 2 ways: using if statement and switch case.
public class Hw4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter number");
        int a=scanner.nextInt();
        System.out.println("Please enter number");
        int b= scanner.nextInt();
        System.out.println("enter operator");
        char op=scanner.next().charAt(0);

        if(op=='+'){
            System.out.println(a+b);
        }else if (op=='-'){
            System.out.println(a-b);
        }else if(op=='*'){
            System.out.println(a*b);
        }else if(op=='/'){
            System.out.println(a/b);
        }else{
            System.out.println("wrong data");
        }

    }
}
