package class8;

import java.util.Scanner;

public class E9BreakKeywords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0;
        while (true) {
            System.out.println("please enter the price of the item or -1 terminate");
            double price = scanner.nextDouble();
            if (price == -1) {
                break;
            } else {
                total = total + price;
            }
            System.out.println("Your total bill is "+total);
        }

    }
}
