package review3;

import java.util.Scanner;

public class E4Switch {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the name of the fruit");
        String fruit=scanner.nextLine();

        switch (fruit){
            case "Orange":
                System.out.println("it is usually orange");
                break;
            case "Banana":
                System.out.println("yellow banana are good");
                break;
            case "Strawberry":
                System.out.println("I like red strawberry");
                break;
            case "blue berry":
                System.out.println("blue berry is good for the heart");
                break;
            default:
                System.out.println("I dont like fruit");


        }
    }
}
