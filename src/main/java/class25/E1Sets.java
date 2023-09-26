package class25;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    public static void main(String[] args) {
        //we can store duplicates in an ArrayList or LinkedList
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);


        HashSet<Integer> uniNumbers=new HashSet<>();//no garatening thats its going to be in order,
        uniNumbers.add(10);
        uniNumbers.add(20);
        uniNumbers.add(10);
        uniNumbers.add(10);
        System.out.println(uniNumbers);
        //
    }

}
