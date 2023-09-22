package class24;
//create an arrylist of food and retrieve all the values and use 2 diff ways to print
import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> food=new ArrayList<>();
        food.add("Apple");
        food.add("Banana");
        food.add("Grapes");
        food.add("Kiwi");
        food.add("Oranges");
        System.out.println(food);

        for (int i = 0; i <food.size() ; i++) {
            System.out.println(food.get(i));

        }
    }
}
