package class24;

import java.util.ArrayList;

//create an arrayList of fruit then remove all the fruit which contains
//        the letter a or ends with the letter e
public class Task6 {
    public static void main(String[] args) {

        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Kiwi");
        fruits.add("Oranges");
        System.out.println(fruits);

        fruits.removeIf(x->x.contains("a") || x.contains("e"));
        System.out.println(fruits);



        }
    }

