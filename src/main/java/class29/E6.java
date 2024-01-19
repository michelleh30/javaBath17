package class29;
//try catch block
import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");

        Scanner scanner=new Scanner(System.in);
        System.out.println("plase enter the size of array");
        try {//java this two line are problme try to do it but if not
            //plan A
            int size = scanner.nextInt();
            int[] arr = new int[size];
        }catch (Exception e){//doesnt matter the excetions print this out
            //plan B if its fails
            System.out.println("user must only enter a positive int number");
        }
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");

    }
}
