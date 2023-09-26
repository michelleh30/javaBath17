package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E5Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",19.0);
        makeUp.put("Blush",22.0);
        makeUp.put("Foundation",45.0);
        makeUp.put("Base",25.0);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",22.0);

        //makeUp.entrySet();//return of a set
        Set<Map.Entry<String, Double>> entries = makeUp.entrySet();
        for (Map.Entry<String, Double> e : entries) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}
