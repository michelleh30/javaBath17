package review11;

import java.util.ArrayList;

public class E7ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");
        fruit.add("Apple");

        fruit.replaceAll(x->{
            if(x.contains("a")){
                return "water";
            }else{
                return "milk";
            }
        });
        System.out.println(fruit);

    }
}
