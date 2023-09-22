package reviewBeforeSelenium;
//if they are multi condition you use else if
import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a grade");

        int n=scanner.nextInt();
        System.out.println(n);//n its whatever you enter

        if(n >= 90 && n <=100){
            System.out.println("A");
        }else if(n >= 80 && n < 90){
            System.out.println("B");
        }else if (n >=70 && n<80){
            System.out.println("C");
        }else if (n >= 60 && n < 70){
            System.out.println("D");
        }else{
            System.out.println("you feild");
        }

    }
}
