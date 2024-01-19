package review12;
//so this final int[] array you can change the value at index 0
// but can't add new numbers in the array correct like add indexes 1 2 3 and etc?
import java.util.HashMap;
import java.util.Map;

public class E4Maps {
    public static void main(String[] args) {

        Map<String,Double> studentMarkMap=new HashMap<>();
        studentMarkMap.put("Michelle",96.8);
        studentMarkMap.put("Neslon",86.3);
        studentMarkMap.put("Mary",76.4);
        studentMarkMap.put("Joe",90.8);

        System.out.println(studentMarkMap);
        //studentMarkMap.forEach((k,v)-> System.out.println(k+" "+v));

        final int[] counter=new int[1];
        studentMarkMap.forEach((k,v)->{
            int c=0;
            if(k.contains("a")|| v>96){
                System.out.println(k+" "+v);
                counter[0]++;
            }
        });
        System.out.println(counter[0]);


    }
}
