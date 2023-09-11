package replitHw6;
/*
Create a method that will accept 2 numbers as parameters and
return true if both numbers are even otherwise returned false

( Return false if one or both given numbers are not even)
 */
public class Hw116 {
    public static void main(String[] args) {

        int num1=6;
        int num2=12;

        if(num1%2==0 && num2%2==0){
            System.out.println("Even");
        }else{
            System.out.println("False");
        }


    }
}
