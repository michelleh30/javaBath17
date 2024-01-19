package review12;

import class9.Array;

import java.util.*;

public class E2Sets {
    public static void main(String[] args) {

        Set<Integer> numbers=new HashSet<>();
        //Set is the parent, hashset impleament set
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);//its not in order

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        LinkedHashSet<Integer> numSet=new LinkedHashSet<>(nums);
        //System.out.println(numSet);//remove the dups
        //*****************
        nums.clear();
        nums.addAll(numSet);
        System.out.println(nums);//this make the list to clear everything and then gets the numbers that are not dups back in








    }
}
