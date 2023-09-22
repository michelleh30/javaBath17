package class24;

import java.util.ArrayList;
//how to add and moves things around in arraylist
public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<String>();//Arraylist<String>(); this is calling the con
        names.add("Michelle");
        names.add("Rosa");
        names.add("Nelson");
        names.add("Valentina");
        //names.remove(0);
        names.remove("Michelle");
        System.out.println(names);
        names.add("Luna");
        System.out.println(names);
        names.add(2,"Rambo");
        System.out.println(names);
        names.set(1,"Coco");//set means replace
        System.out.println(names);

    }
}
