package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        //creating the object of the scanner class so that we can reuse the logic from
        // this class which is already written for us by java developers
        Scanner input=new Scanner(System.in);
        //taking a put of a user and storing in int a name variable
        String name= input.next();
        if(name.equals("Asghar")){
            System.out.println("Java instructor");
        }else{
            System.out.println("I dont know you");
        }
        //System.out.println("Hello "+name);

    }
}
