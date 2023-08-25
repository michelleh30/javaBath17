package codingTasks;

//Maximum and minimum number in the array?
public class   Task8 {
    public static void main(String[] args) {
        int[] numbers = {67, 34, 55, 98, 23};
        int maxNum = numbers[0];
        int miniNum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > maxNum) {
                maxNum = numbers[i];
            }
        }
        System.out.println(maxNum);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < miniNum) {
                miniNum = numbers[i];

            }

        }
        System.out.println(miniNum);
    }

}

