package replitHw10;

import java.util.ArrayList;
import java.util.Scanner;

/*
Using Scanner class add 5 elements into ArrayList and then print all
elements from that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
**Expected Output:**
4 62 8 5 4
 */
public class Hw188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            int numbers = scanner.nextInt();
            nums.add(numbers);
        }
        System.out.println(nums);


    }
}
