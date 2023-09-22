package class24;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");

        for (String x : words) {
            System.out.println(x);
        }
        words.forEach(x -> System.out.println(x));//does not need a loop


        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).contains("e")) {
                words.remove(i);
            }
        }

        words.removeIf(word-> word.contains("e"));//use this instand
    }
}


