package replitHw3;

import java.util.Scanner;

//Prompt user with a question: "Is it weekend?"
//
//If it is not a weekend --> subject="manual testing"
//
//Otherwise --> subject="Java"
public class Assignment38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean input=scanner.nextBoolean();

        if(input== false){
            System.out.println("Today you will be learning manual testing");
        }else{
            System.out.println("Today you will be learning Java");
        }
    }
}
