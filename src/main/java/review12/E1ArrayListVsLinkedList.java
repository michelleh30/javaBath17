package review12;
/*
names= varbible/instance
names right now is a obj that contains lsit
in ArrayList is storing in indexes
array list is good to retrieve info
the Linked list is store based on the link
 */
import java.util.ArrayList;
import java.util.LinkedList;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {
        //arraylist gets the element

        ArrayList<String> names=new ArrayList<>();
        names.add("Jamel");
        names.add("Deepali");
        names.add("Ali");
        names.add("John");
        names.add("Adam");
        System.out.println(names);
        names.add(1,"Nelson");//this well move everything by one because we are replace the name at 1, so its not good to use
        System.out.println(names);

        names.remove(2);
        System.out.println(names);//again shifting is happening  using arraylist--its not go to use


        LinkedList<String> names2=new LinkedList<>();
        names2.add("Jamel");
        names2.add("Deepali");
        names2.add("Ali");
        names2.add("John");
        names2.add("Adam");

    }
}
