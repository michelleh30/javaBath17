package class8;

//print all the even number one by one from the array  using enhanced for loop
// what does % mean? isnt it reminder of division?
public class E5EnhancedLoop {
    public static void main(String[] args) {

        int[] nums = {10, 23, 25, 56, 45, 20};

        for (int even : nums) {
            if (even % 2 == 0) {//?
                System.out.println(even);
            }
        }


    }
}