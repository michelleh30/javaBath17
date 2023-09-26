package class25;

import java.util.ArrayList;
//printing the element
public class E2Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();//Arraylist,new=obj of a class, ()=call the constre of arraylist,

        //how to add methods
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(12);
        numbers.forEach(x-> System.out.println(x));//print numbers, for each elememtns from this number print
    }
}
