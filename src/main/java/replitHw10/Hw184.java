package replitHw10;

import java.util.ArrayList;

/*
Add below elements to it.
111
222
333
444
555
666
Print first, third and fifth element from your array
**Expected Output:**

111
333
555
 */
public class Hw184 {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(111);
        nums.add(222);
        nums.add(333);
        nums.add(444);
        nums.add(555);
        nums.add(666);

        System.out.println(nums.get(0));
        System.out.println(nums.get(2));
        System.out.println(nums.get(4));




    }
}
