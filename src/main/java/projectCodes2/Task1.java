package projectCodes2;
/*
Write a program to swap 2 String without a temporary variable
 */
public class Task1 {
    public static void main(String[] args) {
        String a="Apple";
        String b="Banana";

        String temp;

        temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
    }
}
