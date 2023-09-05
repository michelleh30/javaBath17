package replitHw2;

import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //this is how they have in replit code
        System.out.println("In:");
        String name=scanner.nextLine();

        if(name.equals("Chen")){
            System.out.println("teacher");
        }else{
            System.out.println("student");
        }


    }
}
