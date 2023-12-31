package class26;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
public class E1Maps {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",8.0);
        fruit.put("Banana",3.0);
        fruit.put("Orange",5.2);
        fruit.put("Kiwi",4.0);
        fruit.put("Apple",4.0);
        System.out.println(fruit);//prints all of them

        System.out.println(fruit.size());//size 4, Apple, kiwi, orange, banana

        System.out.println(fruit.containsKey("Apple"));//true

        System.out.println(fruit.containsValue(4.0));

        System.out.println(fruit.containsValue(44));

        System.out.println(fruit.isEmpty());

    }
}
