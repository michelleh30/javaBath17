package class5;
//* writer the user to enter person height in inches. person should be classified as one of the following
//short (under 60 in)
//medium between 60-72 in
// tall over 72 in
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter height in inches");// prompt the user
        int height=scanner.nextInt();// to enter person height in inches

        if (height<60){
            System.out.println("short");
        }else if(height>=60&& height<72){// we are using && because it all have to be true
            System.out.println("medium");
        }else {
            System.out.println("tall");
        }


    }
}
