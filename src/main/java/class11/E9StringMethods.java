package class11;

public class E9StringMethods {
    public static void main(String[] args) {

        String str="Hi There how are you.I am Good. I am Driving";
        //String [] strs= str.split(" ");//tell you how many spaces there are, 10 words
        //System.out.println(strs[0]);//it will print Hi

        String [] strs= str.split("[.\\s]");//12 words, you.I is now split
        System.out.println(strs[4]);// will print you.I b/c its one word
        //String [] strs= str.split("[\\s]");
        System.out.println(strs.length);
        //System.out.println(strs[9]);//cant get driving with 10 it has to be a 9 indexes

        for (String s:strs){//enhance for loop---b/c its an array, now you see all of the words
            System.out.println(s);
        }


    }
}
