package class25;
//so it will just remove duplicates but not sort them, you have to go through all of the elements
// mostly used when you want to remove a duplcate

import java.util.HashSet;

//hash sets have no guarantee order but linked hash sets do
public class E7Sets {
    public static void main(String[] args) {

        HashSet<String> fruit=new HashSet<>();//no order
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Banana");
        System.out.println(fruit);//dirtect printed
        fruit.forEach(x-> System.out.println(x));//lamda
        System.out.println("******************");
        for(String f:fruit){//using enhance loop
            System.out.println(f);
        }

    }

}
