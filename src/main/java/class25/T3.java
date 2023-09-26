package class25;
//Create a Set in which you need to add names of the countries(10).
// In this set we want all objects to be sorted in alphabetical order.
// Using 2 different ways retrieve all elements from set.
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class T3 {
    public static void main(String[] args) {
        TreeSet<String> county=new TreeSet<>();
        county.add("Bolivia");
        county.add("France");
        county.add("Brazil");
        county.add("Cuba");
        county.add("USA");
        county.add("Peru");
        county.add("Spain");
        county.add("China");
        county.add("Japan");
        System.out.println(county);
        System.out.println("**********************");

        for(String c:county){//one way to print
            System.out.println(c);
        }
        county.forEach(x-> System.out.println(x));//another way to print
    }
}
