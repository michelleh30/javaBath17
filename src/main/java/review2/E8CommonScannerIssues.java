package review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter full name");
        String fName=scanner.nextLine();// .nextLine for 2 words .next just one word
        System.out.println("please enter your city");
        String city= scanner.nextLine();
        System.out.println(fName+" "+city);


    }
}
