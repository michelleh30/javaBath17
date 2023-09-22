package class24;
//theres no lenth but we use size
import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<String>();//Arraylist<String>(); this is calling the con
        names.add("Michelle");
        names.add("Rosa");
        names.add("Nelson");
        names.add("Valentina");

        for(int i=0;i<names.size();i++){//for loop
            System.out.println(names.get(i));//this prints out all of the names
        }
        System.out.println("********************");
        for (String n:names){////enhance loop
            System.out.println(n);
        }
        System.out.println("***********************");

        int i=0;//while loop
        while(i<names.size()){//the condition for the loop to stop
            System.out.println(names.get(i));
            i++;
        }
    }
}
