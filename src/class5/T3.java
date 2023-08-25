package class5;
//write a program that will print whether it is a weekend or weekday
//if any day from 1-5 "it is a weekday"
// anyday from 6-7 it is a weekend,
// any other day it is invalid day
// not using scanner because it is not asking for input

public class T3 {
    public static void main(String[] args) {

        int day=5;

        if (day>1 && day <=5){
            System.out.println("it is a weekday");
        }else if (day==6 || day==7){
            System.out.println("it is a weekend");
        }else{
            System.out.println("Invalid day");
        }


    }
}
