package class4;
//*Create a Java program that will ask user to input city and temperature.
// *Your program should convert Fahrenheit into Celsius and print “The temperature is the city  is ”

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input city");

        String city= scanner.next();
        System.out.println("Please enter temperature");
        double temp= scanner.nextDouble();
        double tempC=(temp-32)*5/9;
        System.out.println("The temperature in "+city+" is "+tempC);

    }

}
