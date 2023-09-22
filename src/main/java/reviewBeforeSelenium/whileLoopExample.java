package reviewBeforeSelenium;
//using arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class whileLoopExample {
    public static void main(String[] args) {

        String sentence= "I love halloween";
        Scanner scanner= new Scanner(sentence);

        ArrayList<String>words=new ArrayList<>();

        while(scanner.hasNext()){
            words.add(scanner.next());
        }
        System.out.println(words);

    }
}
