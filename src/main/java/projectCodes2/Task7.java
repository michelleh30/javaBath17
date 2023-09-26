package projectCodes2;

import java.util.ArrayList;
import java.util.Arrays;

/*
You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
 */
public class Task7 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Michelle");
        names.add("Anna");
        names.add("Rose");

        for (String a : names) {
            if (a.startsWith("A")) {
                System.out.println(a.toLowerCase());
            }
        }


    }


}
