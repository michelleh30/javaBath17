package class23;
//array not good for real life bc fix in size, no method,
import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        ArrayList names=new ArrayList();//creating a array for the class, no size, obj
        names.add("Michelle");//method
        names.add("Valentina");//method
        names.add(10);
        names.add('F');
        System.out.println(names.size());//4
        names.remove(0);
        System.out.println(names.size());//size 3
        System.out.println(names);
    }
}
