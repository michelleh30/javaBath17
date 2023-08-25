package class5;
//* ask user to enter a number and then define if number is small medium or large
//small num is value between 1 and 10
//medium number between 11 and 100
// large number between 101 and 1000

import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
// all 3 line would take the input of the user
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scanner.nextInt();

        if (num>=1 && num<10){
            System.out.println("small");
        }else if(num>=11 && num<=100){//
            System.out.println("medium");
        }else if (num>=101 && num<=1000){
            System.out.println("large");
        }

    }
}
