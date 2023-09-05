package class11;
//how to split
public class E10StringMethods {
    public static void main(String[] args) {

        //String str="Hi#There#how#are#you";//you split methods to get each word
        //           0   1    2   3   4

        //String [] strArr=str.split("[#]");//array
        //System.out.println(strArr.length);//will print 5
        //System.out.println(strArr[1]);//this will print There

        String str="Hi There how are you";

        String [] array=str.split(" ");
        System.out.println(array.length);
        System.out.println(array[3]);



    }
}
