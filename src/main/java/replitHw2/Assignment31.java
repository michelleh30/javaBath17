package replitHw2;

import java.util.Scanner;

public class Assignment31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Is it sunny outside?");
        boolean isSunny=scanner.nextBoolean();

        if(isSunny==true){
            System.out.println("it is a sunny day, I should go somewhere!");}

                else{
            System.out.println("I stay home and practice Java!");}

        System.out.println("What is the temperature outside?");
        int temp=scanner.nextInt();
        if(temp>85){
            System.out.println("I am going to the beach!");}
        else{
            System.out.println("I am going to the park!");
        }

    }
}
