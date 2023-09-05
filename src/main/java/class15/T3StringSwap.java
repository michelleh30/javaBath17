package class15;

public class T3StringSwap {
    public static void main(String[] args) {

        String str1="Shawn";
        String str2="Michelle";
        str1=str1+str2;//ShawnPease=105=5 0,5=shawn

        str2=str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);
    }
}
