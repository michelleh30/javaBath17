package review11;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Apple");

        fruit.set(2,"Grapes");//it replace the original element at index 2
        System.out.println(fruit);
        fruit.isEmpty();//returns boolean


        System.out.println(fruit.indexOf("Apple"));//gives the index 0 bc thats where the apple is
        System.out.println(fruit.lastIndexOf("Apple"));

    }
}
