package class25;
/*
How can you remove all duplicates from ArrayList?

List<String> aList=new ArrayList<>();
aList.add("John");
aList.add("Jane");
aList.add("James");
aList.add("Jasmine");
aList.add("Jane");
aList.add("James");
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        HashSet<String> names=new HashSet<>(aList);
        aList.clear();
        aList.addAll(names);
        System.out.println(names);
    }
}
