package class26;

import java.util.TreeMap;

public class E11Maps {
    public static void main(String[] args) {
        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",19.0);
        makeUp.put("Blush",40.0);
        makeUp.put("Foundation",45.0);
        makeUp.put("Base",25.0);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",22.0);

        //makeUp.entrySet().removeIf(x->x.getKey().contains("a"));//remove anything that has 'a'
        //makeUp.entrySet().removeIf(x->x.getValue()>30);
        makeUp.entrySet().removeIf(x->x.getKey().contains("a") && x.getValue()>30);//its doing both thats why you see blush
        System.out.println(makeUp);

    }
}
