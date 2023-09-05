package replitHw3;

import java.util.Scanner;

//Take 2 boolean inputs from a user:
//"Are you thirsty?"
//"Are you sleepy?"
//If user is thirsty and not sleepy--> drink=water
//If user is thirsty and sleepy--> drink=coffee
//If user is not thirsty and sleepy --> drink=tea
//Otherwise drink="nothing"
public class Assignment37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean answer1=scanner.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean answer2=scanner.nextBoolean();

        if(answer1 && !answer2){
            System.out.println("Looks like you need to drink water");
        } else if(answer1==answer2){
            System.out.println("looks like you need to drink coffee");
        }else if(!answer1 && answer2){
            System.out.println("looks like you need to drink tea");
        }else{
            System.out.println("looks like you need to drink nothing");


            //*Scanner scanner=new Scanner(System.in);
            //        System.out.println("Are you thirsty?");
            //        boolean isThirsty=scanner.nextBoolean();
            //        System.out.println("Are you sleepy?");
            //        boolean isSleepy=scanner.nextBoolean();
            //
            //        if(isThirsty &&!isSleepy){
            //            System.out.println("Looks like you need to drink water");
            //        }else if(isThirsty){
            //            System.out.println("Looks like you need to drink coffee");
            //
            //        }else if(isSleepy){
            //            System.out.println("Looks like you need to drink tea");
            //
            //        }else {
            //            System.out.println("Looks like you need to drink nothing");

            //how one of the assistant help me
        }

    }
}
