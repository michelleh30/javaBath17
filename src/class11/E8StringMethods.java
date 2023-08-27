package class11;

public class E8StringMethods {
    public static void main(String[] args) {

        String str="Hi There how are you. I am Good.  I am Driving";
        String [] strs= str.split("[.]");
        System.out.println(strs.length);//split it into 3 parts
        System.out.println(strs[2].trim());//this prints out the last sentece with out the extra space


    }
}
