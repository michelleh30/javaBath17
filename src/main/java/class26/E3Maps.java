package class26;
/*
it goes by alphabetical order
 */
import java.util.Collection;
import java.util.TreeMap;

public class E3Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",19.0);
        makeUp.put("Blush",22.0);
        makeUp.put("Foundation",45.0);
        makeUp.put("Base",25.0);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",22.0);
        System.out.println(makeUp);
        //System.out.println(makeUp.keySet());
        Collection<String> onlyKeys=makeUp.keySet();
        System.out.println(onlyKeys);

        Collection<Double> onlyValue=makeUp.values();
        System.out.println(onlyValue);







    }
}
