package replitHw10;

import java.util.ArrayList;

/*
Create an array list that will hold String Objects

Find out wether array list is empty or not.

Add String value "Syntax" to it

Find out wether array list is empty or not.

**Expected Output:**

```
true
false
 */
public class Hw183 {
    public static void main(String[] args) {
        ArrayList<String> objs=new ArrayList<>();
        System.out.println(objs.isEmpty());

        objs.add("Syntax");

        System.out.println(objs.isEmpty());


    }
}
