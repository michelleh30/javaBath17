package class8;
//print all the even number one by one from the array  using enhanced for loop
public class E6EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20,};

        for (int i = 0; i <nums.length ; i++) {

            if (nums[i] > 20) {//if any number is greater than 20 inside the array, next line
                nums[i] = 0;//set that number to zero

            }
            System.out.println(nums[i]);
        }



    }
}