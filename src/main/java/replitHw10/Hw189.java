package replitHw10;

import java.util.LinkedList;

/*
Create a Linked List that will store Integer Objects from 50-100.

Once Linked List is created remove all numbers that are not divisible by 3.

Print Linked List

**Expected Output**

[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
 */
public class Hw189 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();

        for (int i = 50; i <=100 ; i++) {
            numbers.add(i);

        }
        System.out.println(numbers);//prints all the numbers
        numbers.removeIf(x->x%3==0);
        System.out.println(numbers);





    }
}
