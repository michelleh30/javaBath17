package class25;

import java.util.LinkedHashSet;

/*
Create a Set of cities in which you want to make sure that insertion
order is maintained. Then remove any city that starts with “A”;
 */
public class T4 {
    public static void main(String[] args) {
        LinkedHashSet<String>cities=new LinkedHashSet<>();
        cities.add("Falls Church");
        cities.add("Arlington");
        cities.add("Woodbridge");
        cities.add("Fairfax");
        System.out.println(cities);

        cities.removeIf(x->x.startsWith("A"));
        System.out.println(cities);

    }
}
