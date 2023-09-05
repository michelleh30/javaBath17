package replitHw4;

//Using the following array.
//
//{45, 78, 12,  67, 55, 89, 23, 77, 88}
//
//Create a for loop to extract values from that array so your output looks as below:
//output 78 55 77
public class Assignment75 {
    public static void main(String[] args) {

        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 78 && numbers[i] == 55 && numbers[i] == 77) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();


    }
}
