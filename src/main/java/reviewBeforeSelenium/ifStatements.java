package reviewBeforeSelenium;

//if staments = performs a block od code if its condition evaluates to be true
//if its false it prints out whats in the else stammanet
public class ifStatements {
    public static void main(String[] args) {
        int age = 75;


        if (age == 75) {

            System.out.println("Ok Boomer!");

        } else if (age >= 18) {

            System.out.println("You are an adult!");

        } else if (age >= 13) {

            System.out.println("You are a teenager!");

        } else {

            System.out.println("You are not an adult!");

        }

    }
}