package class24;

import java.util.ArrayList;

/*
Create an Arraylist that will store 5 names into it.
finf out whether the given Arraylist is empty ir not
check whether the specific name is present in the Arraylist
find the size of your arraylist and print
 */
public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Michelle");
        names.add("Rosa");
        names.add("Nelson");
        names.add("Valentina");
        names.add("Luna");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Valentina"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
