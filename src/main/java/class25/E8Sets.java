package class25;
//no dups but in order
//Linked is just to keep the order
import java.util.LinkedHashSet;

public class E8Sets {
    public static void main(String[] args) {

        LinkedHashSet<Integer> uniqueNumbers=new LinkedHashSet<>();
        uniqueNumbers.add(10);
        uniqueNumbers.add(20);
        uniqueNumbers.add(10);
        uniqueNumbers.add(30);
        System.out.println(uniqueNumbers);

    }
}
