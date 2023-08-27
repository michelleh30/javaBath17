package class11;

public class E9StringMethods {
    public static void main(String[] args) {

        String str="Hi There how are you.I am Good. I am Driving";
        //String [] strs= str.split(" ");//tell you how many spaces there are
        String [] strs= str.split("[.\\s]");
        //String [] strs= str.split("[\\s]");
        System.out.println(strs.length);
        //System.out.println(strs[9]);//cant get driving with 10 it has to be a 9 indexes
        for (String s:strs){
            System.out.println(s);
        }


    }
}
