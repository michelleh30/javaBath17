package class25;
//for a shift linklist is better
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class E4ListVsListedList {
    public static void main(String[] args) {

        long startingTime=System.currentTimeMillis();
        //System.out.println(startingTime);//getting the time

        LinkedList<Integer>numbers=new LinkedList<>();
         for (int i = 0; i <100000 ; i++) {
            numbers.add(0,i);

        }
        long endTime=System.currentTimeMillis();
        long timeTook=(endTime-startingTime);
        System.out.println(timeTook);
    }
}
