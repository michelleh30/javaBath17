package class7;
//From an array of integer elements find the largest number.
public class Hw7 {
    public static void main(String[] args) {

        int[] numbers={5,28,65,78,20};
        int largestNumber=numbers[0];

        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i]>largestNumber){
                largestNumber=numbers[i];
            }

        }
        System.out.println(largestNumber);
    }
}
