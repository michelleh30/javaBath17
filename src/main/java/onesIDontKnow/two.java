package onesIDontKnow;
//#9
public class two {
    public static void main(String[] args) {
        int[] numbers = {15, 25, 4, 8, 11, 20, 10};

        int max1 = numbers[0];
        int max2 = numbers[0];

        for (int num: numbers){
            if( num> max1){
                max2=max1;
                max1=num;

            } else if (num> max2 && num !=max1) {
                max2=num;

            }

        }

        System.out.println("The second largest number in this array is "+max2);
    }
}
