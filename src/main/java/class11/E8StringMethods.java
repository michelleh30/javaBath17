package class11;
//how to split
//its an array of strings
public class E8StringMethods {
    public static void main(String[] args) {

        String str="Hi There how are you. I am Good.  I am Driving";
        //      array          0                   1            2
        String [] strs= str.split("[.]");
        System.out.println(strs.length);//split it into 3 parts
        System.out.println(strs[2].trim());//this prints out the last sentence with out the extra space


    }
}
