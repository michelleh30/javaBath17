package review11;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();//a array of string
        names.add("Michelle");//0
        names.add("Valentina");//1
        names.add("Valentina");
        names.add("Nelson");//2
        names.add("Rosa");//3


        System.out.println(names.size());//give us the size of the array how many elements they are
        System.out.println(names.get(2));//Nelson
        //System.out.println(names.remove(0));//remove michelle, this one is fastest to remove, if you know the index always use it
        //System.out.println(names.remove("Valentina"));
        System.out.println(names.remove("Michelle"));//array has to search for the name to be remove,
        // its very slow.--this return a false b/c it already remove michelle
        System.out.println(names.remove("Mike"));// flase because we dont have Mike
        System.out.println(names.contains("Michelle"));//true
        System.out.println(names);

        names.removeIf(x->x.equals("Valentina"));
        System.out.println(names);


    }
}
