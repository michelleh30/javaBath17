package review3;

import java.util.Scanner;

public class E5SwitchForLoop {
    public static void main(String[] args) {


        for (int i = 0; i <=3; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the fruit");
            String fruit = scanner.nextLine();

            switch (fruit) {
                case "Orange":
                    System.out.println("It is usually Orange");
                    break;
                case "Banana":
                    System.out.println("Yellow Bananas are good");
                    break;
                case "Strawberry":
                    System.out.println("I like Red strawberries");
                    break;
                case "Blueberry":
                    System.out.println("Blue berries are very good for heart ");
                    break;
                default:
                    System.out.println("I don't like this fruit");


            }
        }

    }
}

