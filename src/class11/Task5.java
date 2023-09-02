package class11;
//you have a String a="Is it saturday? Is it raining? Do we have Java Class today?
//how would you find out how many sentences are in the string?
public class Task5 {
    public static void main(String[] args) {

        String a="Is it saturday? Is it raining? Do we have Java Class today?";
        String [] word=a.split("[?]");
        //System.out.println(a.length());//need to use length to get the whole String,
        // this will give me how many chara there are which is 59
        System.out.println(word.length);

    }
}
