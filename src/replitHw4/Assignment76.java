package replitHw4;

import java.util.Scanner;

public class Assignment76 {
    public static void main(String[] args) {
        String [] days=new String[7];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <days.length; i++) {
            days[i]=scanner.next();

        }

        for (int j = 0; j < days.length; j++) {
            System.out.println(days[j]);

        }
    }
}
