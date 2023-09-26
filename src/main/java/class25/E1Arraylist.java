package class25;

import java.util.ArrayList;

public class E1Arraylist {
    public static void main(String[] args) {

        int [] arr=new int[5];//array
        ArrayList<Integer> numbers=new ArrayList<>();//Arraylist,new=obj of a class, ()=call the constre of arraylist,

        //how to add methods
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(12);
        System.out.println(numbers);

        //call a method to remove a number
        numbers.remove(1);
        System.out.println(numbers);

        //remove mutil elements use lamdas
        numbers.removeIf(x->x>12);//x>12 this is the condition, anything grater than 12
        System.out.println(numbers);
    }
}
