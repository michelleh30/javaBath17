package replitHw3;

import java.util.Scanner;

//You should input:
//
//```
//int end;
//```
//
//Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value of end(value must be taken from a user), exclusive.
//
//Each number should be on the same line, separated by a space.
public class Assignment64 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int input= scanner.nextInt();

        for (int i = 0; i <= input; i++) {
            System.out.print(i+" ");


        }

    }
}
/*Scanner scanner=new Scanner(System.in);
    int userInput=scanner.nextInt();

    for(int i=0;i< userInput*2; i++){
      System.out.print(i+" ");
    this was already in replit so this is the correct way I think*/