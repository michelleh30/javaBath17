package review11;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Apple");

        ArrayList<String> veggies=new ArrayList<>();
        veggies.add("Potato");
        veggies.add("Carrot");
        veggies.add("Cucumber");
        System.out.println(veggies);
        veggies.addAll(fruit);//add all the fruits inside the veggies
        System.out.println(veggies);
        veggies.removeAll(fruit);
        System.out.println(veggies);


        //ArrayList <String> vegetables = new ArrayList<>(fruit); we can do this too
    }
}
