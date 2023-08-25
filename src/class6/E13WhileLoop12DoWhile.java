package class6;

import java.util.Scanner;

public class E13WhileLoop12DoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;

        System.out.println("please enter a number or -1 to terminate");
        input=scanner.nextInt();
        System.out.println("you are entered "+input);
        while (input != -1) {
            System.out.println("please enter a number or -1 to terminate");
            input = scanner.nextInt();
            System.out.println("you are entered " + input);
        }
    }
}
