package replitHw2;
// got the answer from discore
import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {


        Scanner values = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = values.nextInt();
        System.out.println("Please enter the width");
        int width = values.nextInt();

        if (length != width) {
            System.out.println("The shape of your object is rectangle");
        } else {
            System.out.println("The shape of your object is square");
        }
    }
}
