package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E10 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        numbers.add(10);
        System.out.println(numbers);//original

        HashSet<Integer> set=new HashSet<>(numbers);
        System.out.println(set);//no dups

        numbers.clear();
        System.out.println(numbers);//clears

        numbers.addAll(set);
        System.out.println(numbers);//gets the one with no dups, resets it

    }
}
