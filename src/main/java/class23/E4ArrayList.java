package class23;
//only string
import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr=new ArrayList();
        arr.add("Ace");
        //arr.add(25);//can only put string
        arr.add("Michelle");
        arr.add("Rosa");
        System.out.println(arr.get(2));
        System.out.println(arr.isEmpty());
        System.out.println(arr.contains("Ace"));
        System.out.println(arr.indexOf("Michelle"));
    }
}
