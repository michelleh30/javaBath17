package review3;
//Ask the user to input two boolean values (true or false).
//Use the logical AND operator (&&) to determine if both are true.
//Display the result to the user.

import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("do you work out?");
        boolean input1=scanner.nextBoolean();
        System.out.println("do you stay on a diet");
        boolean input2=scanner.nextBoolean();

        if(input1&&input2){
            System.out.println("Both are true");
        }else{
            System.out.println("both are not true");
        }



        //Scanner scanner=new Scanner(System.in);
        //System.out.println("do you work out?");
       // boolean input1=scanner.nextBoolean();
        //System.out.println("do you stay on a diet");
        //boolean input2=scanner.nextBoolean();




    }
}
