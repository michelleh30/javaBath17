package class26;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/*
Create a map of Best Buy. Place item id and item name into it.
ex
 */
public class T4 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> bestbuy=new LinkedHashMap<>();
        bestbuy.put(456,"Computer");
        bestbuy.put(4123,"TV");
        bestbuy.put(986,"Speaker");
        bestbuy.put(786,"Printer");

        var enteries=bestbuy.entrySet();
        for(var e:enteries){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}
