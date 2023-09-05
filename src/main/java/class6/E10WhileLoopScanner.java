package class6;
//scanner
import java.util.Scanner;

//dont want to see num 7
public class E10WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the starting point");
        int start = scanner.nextInt();//starting point

        System.out.println("please enter the ending point");
        int end= scanner.nextInt();
        System.out.println("please enter the steps as well");
        int step = scanner.nextInt();

        while (start <= end){
            System.out.print(start+ " ");
            start += step;


        }
    }
}
