package class5;

import java.util.Scanner;

//ask user to enter their country and capture it
// once value are captured print which language users speaks
public class T5Hw {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your country");
        String country= scanner.nextLine();
        country=country.toLowerCase();

        switch (country){
            case "usa":
                System.out.println("English");
                break;
            case "bolivia":
                System.out.println("Spanish");
                break;
            case "brazil":
                System.out.println("portages");
                break;
            case "italy":
                System.out.println("italian");
                break;
            default:
                System.out.println("wrong country");
        }

    }
}
