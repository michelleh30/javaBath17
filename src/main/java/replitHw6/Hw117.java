package replitHw6;
////Create a method with the following specs:
////Returns:`
////an integer
////Name:
////sumEvenToX
////Parameters:
////an integer called "x"
////Purpose:
////calculate the sum of the EVEN integers from 1 to x (including x)
////Examples:
//
////sumEvenToX(5) ==> 6
////sumEvenToX(8) ==> 20
public class Hw117 {
    public static void main(String[] args) {
        System.out.println(sumEvenToX(5));
    }
    static int sumEvenToX( int x){
        int sum = 0;
        for (int i = 2; i <= x; i = i + 2) {//+2 gets even num
            sum=sum+i;

        }
        return sum;
    }
}
