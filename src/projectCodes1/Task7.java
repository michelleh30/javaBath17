package projectCodes1;

//Write a Java Program to print the first 10 numbers of Fibonacci series.
public class Task7 {
    public static void main(String[] args) {
        int n=10;
        int num1=0;
        int num2=1;

        for (int i = 1; i <=n ; i++) {
            System.out.print(num1+ " ");

            int num3=num1+num2;
            num1=num2;
            num2=num3;

        }


    }
}
