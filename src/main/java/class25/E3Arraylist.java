package class25;

import java.util.ArrayList;
import java.util.LinkedList;

//linked list is not organized
public class E3Arraylist {
    public static void main(String[] args) {
        LinkedList<Integer>numbers=new LinkedList<>();
        //List<Integer>numbers=new LinkedList<>(); List is the parent so you can use Link, framework on the ppt picture
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);

        //removing a numbers
        numbers.remove(2);
        System.out.println(numbers);

        numbers.removeIf(x->x<15);
        System.out.println(numbers);//remove number grader than 15




    }
}
