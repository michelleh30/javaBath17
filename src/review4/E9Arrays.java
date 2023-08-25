package review4;
//this is scanner and arrays
import java.util.Arrays;
import java.util.Scanner;

public class E9Arrays {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=scanner.nextInt();//what user is going to enter
        int [] numbers=new int[size];

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Please enter the number");
            numbers[i]= scanner.nextInt();
        }
        System.out.println("You entered these numbers");
        System.out.println(Arrays.toString(numbers));//prints all the elements of an array on the line
    }
}
