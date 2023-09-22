package class24;

import java.util.ArrayList;

//create an arraylist of drinks . if any drinks has a letter "a"
//"e" replace it with water
public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Hot Cococa");
        drinks.add("Apple Juice");
        drinks.add("Pesi");
        drinks.add("Milk");


        for (int i = 0; i < drinks.size(); i++) {

            String drink= drinks.get(i);
           if(drink.contains("a") || drink.contains("e")){
               drinks.set(i,"water");
           }

        }
        System.out.println(drinks);
    }
}
