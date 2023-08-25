package class5;

import java.util.Scanner;

//Allow user to enter grade (A, B, or C etc...)
// and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
// any other grade -->Not Acceptable.
// At the end your program should print which grade was entered by a user with explanation.
public class Hw3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your grade");
        char grade=scanner.next().charAt(0);

        if (grade=='A'){
            System.out.println("Grade is A-Excellent");
        }else if (grade=='B'){
            System.out.println("Grade is  B-Good");
        }else if (grade=='C'){
            System.out.println("Grade is C-Average");
        }else if (grade=='D'){
            System.out.println("Grade is D-Bad");
        }else{
            System.out.println("Not Acceptable");
        }
        
    }
}
