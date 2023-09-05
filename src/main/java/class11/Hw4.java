package class11;
//You have a String a=”Is it saturday? Is it raining?
// Do we have a Java Class today?”
// How would you find out how many sentences are in that String?
public class Hw4 {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] words=a.split("[?]");
        System.out.println(words.length);

    }
}
