package replitHw10;

import java.util.ArrayList;

/*
Create an array list to type String.
Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
**Expected Output:**
yo yolo
 */
public class Hw187 {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("hi");//0
        words.add("yo");//1
        words.add("sup");//2
        words.add("yolo");//3
        words.add("boop");//4

        words.remove(0);
        System.out.println(words);

        words.remove(2);
        System.out.println(words);

        words.remove(3);
        System.out.println(words);



    }
}
