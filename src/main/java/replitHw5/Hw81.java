package replitHw5;
//Write a program that prints the highest value in the array.
// input [5,4,8]
public class Hw81 {
    public static void main(String[] args) {
        int [] numbers={5,4,8};
        int largestNumber=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i]>largestNumber){
                largestNumber=numbers[i];
            }
        }
        System.out.println(largestNumber);

    }
}
