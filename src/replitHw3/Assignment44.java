package replitHw3;

import java.util.Scanner;

//*Prompt user with questions: "Please enter your favorite car make"
//
//- if user enters  BMW -->  carOrigin = "german car"
//- if user enters  Toyota -->  carOrigin = " japanese car"
//- if user enters  Maserati -->  carOrigin = "italian car"
//- anything else besides those values --> carOrigin = "unknown"
public class Assignment44 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String car= scanner.nextLine();

        switch (car) {
            case "BMW":
                System.out.println("german car");
                break;
            case "Toyota":
                System.out.println("japanese car");
                break;
            case "Maserati":
                System.out.println("italian car");
                break;
            default:
                System.out.println("unknown");
        }

    }
}
