package class12;
//making a methods
import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {

        takeUserInput();//this used the method that we created. When ever Java see this name, Java is going to find
        // this the method(static void takeUserInput(){) then it will exsecu all the time

        //if (age<18){
            //System.out.println("you are not allowed to vote enter the detail of the next person");
            //takeUserInput();//this would be replacing the Scanner

            /*
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter your name");
            String name=scanner.nextLine();
            System.out.println("Please enter your age");
            int age=scanner.nextInt();
            System.out.println("your name is "+name+" and you are "+age+" years old");

             */

        //}


    }
    static void takeUserInput(){//this is a methods we are going to use that we made. use this code to make a method
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("your name is "+name+" and you are "+age+" years old");



        //we are creating the object of the Scanner class
        //Scanner scanner=new Scanner(System.in);
        //using the scanner obj we are calling the nextline Method
        //scanner.nextInt();

    }
}
