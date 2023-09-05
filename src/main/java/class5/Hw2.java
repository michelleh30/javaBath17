package class5;

import java.util.Scanner;

//Write a program that will read three inputs of scores (quiz, mid term, and final scores)
// and determine the grade based on the following rules:
//if the average score >=90 → grade=A
//if the average score >= 70 and <90 → grade=B
//if the average score>=50 and <70 → grade=C
//if the average score<50 → grade=F
public class Hw2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade= scanner.nextInt();

        if(grade>90){
            System.out.println("Grade is A");
        }else if (grade>=70 && grade<90){
            System.out.println("Grade is B");
        }else if (grade>=50 && grade<70){
            System.out.println("Grade is C");
        }else if (grade<50){
            System.out.println("Grade is F");
        }
    }

}
