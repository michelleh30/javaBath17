package class11;
//goes by index and count the spaces as well
public class E4StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is A great batch. Just kidding. Please dont take it seriously";


        String subStr=str.substring(0,4);//4 will be like less then it will not print 'h' only
        // 'batc' starting point to ending point of the rang you want "Batch 17 is A great batch"
        String subStr1=str.substring(6,25);
        System.out.println(subStr);
        System.out.println(subStr1);
    }
}
