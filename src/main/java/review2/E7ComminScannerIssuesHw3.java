package review2;

import java.util.Scanner;

public class E7ComminScannerIssuesHw3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("What city are you in?");
        String city=scanner.nextLine(); // to have the whole answer in the box "falls church" .next is only for one word
        System.out.println("What is the temperature in that city in fahrenheit?");
        double fahrenheit=scanner.nextDouble();
        double celsius=(fahrenheit-32)*5/9;
        System.out.println("The temperature in "+city+" is "+celsius);

    }
}
