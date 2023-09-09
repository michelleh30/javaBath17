package replitHw6;

import java.util.Scanner;

//You have Scanner class to input string value.
//
//If language is Java it should print the:
//
//"Java is a programming language".
//
//If language is C it should print the:
//
//"C is a procedural programming language"
//
//If language is C++ it should print the:
//
//"C++ is a middle-level programming language"
//
//If any other should print:
//
//"Doesn't match any programming language"
public class Hw96 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any programming language");
        String language = scanner.nextLine();

        if(language.equals("Java")){
            System.out.println("Java is a programming language");
        }else if(language.equals("C")){
            System.out.println("C is a procedural programming language");
        }else if(language.equals("C++")){
            System.out.println("C++ is a middle-level programming language");
        }else{
            System.out.println("Doesn't match any programming language");
        }

    }
}
