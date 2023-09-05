package class5;

//*Write a program for user to enter his/hers birth month. Based on the month define the season.
//Example: if user is born in March, April, May → season =”Spring”
//if user is born in June, July, August →
//season =”Summer”  etc …
//At the end of the program we should see 1 output as “You were born is season __”.


import java.util.Scanner;

public class T1 { //
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter birth month");
        String birthmonth= scanner.next();

        if (    birthmonth.equalsIgnoreCase("mar")||
                birthmonth.equalsIgnoreCase("apr")||
                birthmonth.equalsIgnoreCase("may")
        ){
            System.out.println("Spring");

        } else if (birthmonth.equalsIgnoreCase("jun")||
                birthmonth.equalsIgnoreCase("jul")||
                birthmonth.equalsIgnoreCase("aug")){
            System.out.println("summer");
        }else if (birthmonth.equalsIgnoreCase("sep")||
                birthmonth.equalsIgnoreCase("oct")||
                birthmonth.equalsIgnoreCase("nov")){
            System.out.println("fall");
        }



    }
}
