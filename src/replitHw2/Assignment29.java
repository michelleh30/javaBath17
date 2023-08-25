package replitHw2;
//Step 1: Your program should ask "Please enter first number" - for the 1st number and "Please enter second number" - for the 2nd number.
//
//Step 2: Create if condition to check if the multiplication of x and y values is positive or negative.
//
//If the result of a multiplication is positive print true, otherwise print false.
import java.util.Scanner;

public class Assignment29 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter second number");
        int num2= scanner.nextInt();

        int result=num1*num2;
        if (result>0){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
