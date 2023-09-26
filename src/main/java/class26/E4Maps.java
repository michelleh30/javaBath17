package class26;

import java.util.TreeMap;

public class E4Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",19.0);
        makeUp.put("Blush",22.0);
        makeUp.put("Foundation",45.0);
        makeUp.put("Base",25.0);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",22.0);
        //can use lamdas
        //makeUp.forEach((key,value)-> System.out.println(key+" "+value));//prints all
        makeUp.forEach((k,v)-> System.out.println(k));//prints only keys
        makeUp.forEach((k,v)-> System.out.println(v));//only values
        //whenever you need more than one parameter you need to put ()
        //similary if we want to have more than one line of code we need to have curly brackets as well


        makeUp.forEach((k,v)->{
            if(k.contains("a")){
                System.out.println(v);
            }
        });

    }
}
