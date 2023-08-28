package class12;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {
        takeUserInput();//this used the method that we created


    }
    static void takeUserInput(){//this is a methods we are going to use that we made
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("your name is "+name+" and you are "+age+" years old");
    }
}
