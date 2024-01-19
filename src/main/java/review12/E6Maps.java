package review12;

import java.util.HashMap;
import java.util.Map;

public class E6Maps {
    public static void main(String[] args) {

        Map<String,Double> studentMarkMap=new HashMap<>();
        studentMarkMap.put("Michelle",96.8);
        studentMarkMap.put("Neslon",86.3);
        studentMarkMap.put("Mary",76.4);
        studentMarkMap.put("Joe",90.8);

        System.out.println(studentMarkMap);
        studentMarkMap.replaceAll((k,v)->{

            if(k.contains("a")){
                return 10.0;
            }else{
                return v;
            }
        });
        System.out.println(studentMarkMap);
    }
}
