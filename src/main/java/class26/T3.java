package class26;
/*
Only print those countries which contain more than 5 letter in their
 name and the letter 'a' in their capital names
 */
import java.util.TreeMap;

public class T3 {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Mexico","DF");
        countries.put("Peru","Lima");
        countries.put("Japan","Tokyo");
        countries.put("Spain","Madrid");

        countries.forEach((k,v)->System.out.println(k+" "+v));
        System.out.println("*********");


        countries.forEach((k,v)->{
            if(k.length()>5 && v.contains("a"))
                System.out.println(k+" "+v);
        });
    }
}
