package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class E9Maps {
    public static void main(String[] args) {
        //<string> means we will be storing the obj of String class inside this set
        Set<String> s=new LinkedHashSet<>();

        Integer i=new Integer(10);//i contain the Integer class
        String name=new String("Michi");
        s.add(name);

        Set<ArrayList<String>> test=new LinkedHashSet<>();
        String name2="James";
        //test.add(names2);
        ArrayList<Integer> numbers=new ArrayList<>();
        Integer g=10;
        //test.add(numbers)
        ArrayList<String> j=new ArrayList<>();
        test.add(j);
    }
}
