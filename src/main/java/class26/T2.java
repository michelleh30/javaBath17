package class26;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.
 */
import java.util.TreeMap;

public class T2 {
    public static void main(String[] args) {

        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Mexico","DF");
        countries.put("Peru","Lima");
        countries.put("Japan","Tokyo");
        countries.put("Spain","Madrid");

        countries.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("*********");
        countries.forEach((k,v)->System.out.println(k));
    }
}
