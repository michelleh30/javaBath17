package replitHw2;

import java.util.Scanner;

public class Assignment30 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter month number");
        int day= scanner.nextInt();


        if (day==1){
            System.out.println("January");
        }else if(day==2){
            System.out.println("February");
        }else if(day==3){
            System.out.println("March");
        }else if(day==4){
            System.out.println("April");
        }else if(day==5) {
            System.out.println("May");
        }else if (day==6){
            System.out.println("June");
        }else if (day==7){
            System.out.println("July");
        }else if (day==8){
            System.out.println("August");
        }else if (day==9){
            System.out.println("September");
        }else if (day==10) {
            System.out.println("October");
        }else if (day==11) {
            System.out.println("November");
        }else if (day==12){
            System.out.println("December");
        }else {
            System.out.println("Invalid");
        }


    }
}
