package class26;
/*
LinkedHashSet will main order--
when ever you see Linked it will always mainted the order
 */
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class E2Maps {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> students=new LinkedHashMap<>();

        students.put(10,"Adam");
        students.put(20,"Michelle");
        students.put(30,"Nelson");
        students.put(40,"Ana");
        System.out.println(students);
        students.remove(30);//remove Nelson
        System.out.println(students);
        students.replace(20,"Jamel");//replacing the vaule-Michelle to Jamel
        System.out.println(students);


    }
}
