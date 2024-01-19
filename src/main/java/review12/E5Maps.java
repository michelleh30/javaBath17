package review12;
//entries.removeIf(x -> x.getKey().contains("e"));

import java.util.*;

public class E5Maps {
    public static void main(String[] args) {

        Map<String,Double> studentMarkMap=new HashMap<>();
        studentMarkMap.put("Michelle",96.8);
        studentMarkMap.put("Neslon",86.3);
        studentMarkMap.put("Mary",76.4);
        studentMarkMap.put("Joe",90.8);

        System.out.println(studentMarkMap);
        Set<Map.Entry<String, Double>> entrySet = studentMarkMap.entrySet();
        //entry set


        //we have to convert into a collection

    }
}
