package review11;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Cherry");

        //fruit.clear();//it removes everything
        //fruit.forEach(x-> System.out.println(x));//this prints all the fruits


        fruit.forEach(x->{
            if(x.contains("a")){
                System.out.println(x);
            }//condition
        });
        //System.out.println(fruit);

    }
}
