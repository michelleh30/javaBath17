package class26;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class E8Maps {
    public static void main(String[] args) {

        LinkedList<ArrayList<Integer>> test=new LinkedList<>();

        //test.add(20); error bc it has to be arraylist of int
        ArrayList<String> names=new ArrayList<>();
        names.add("Jmael");
        //test.add(names);

        LinkedList<Integer> numbers=new LinkedList<>();
        //test.add(numbers);error everything should match
        Map<String,Integer> map=new HashMap<>();
        //test.add(map) error because diff data strucer

        ArrayList<Integer> n=new ArrayList<>();
        test.add(n);


    }
}
