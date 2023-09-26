package class26;
//var
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class E10Maps {
    public static void main(String[] args) {

        TreeMap<String,Double> makeUp=new TreeMap<>();
        makeUp.put("Lipsticks",19.0);
        makeUp.put("Blush",22.0);
        makeUp.put("Foundation",45.0);
        makeUp.put("Base",25.0);
        makeUp.put("EyeLiner",25.5);
        makeUp.put("Concealer",22.0);

        //Set <Map.Entry<String, Double>> entries= makeUp.entrySet();
        //for(Map.Entry<String, Double> e:entries){
            //ystem.out.println(e.getKey()+" "+e.getValue());

    //}
        var enteries= makeUp.entrySet();
        for(var e:enteries){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
