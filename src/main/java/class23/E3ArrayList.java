package class23;

import java.util.ArrayList;
import java.util.Scanner;

public class E3ArrayList {
    public static void main(String[] args) {

        ArrayList arr=new ArrayList();
        String str="Michelle";
        arr.add(str);
        Integer i=new Integer(22);
        arr.add(i);
        Scanner s=new Scanner(System.in);
        arr.add(s);

        checkPrint(arr);


    }
   static void checkPrint(ArrayList aa){//this is a loop
        for(Object d:aa){
            String str=(String)d;
            System.out.println(str.length());

        }
    }
}
