package class11;

public class E7StringMethods {
    public static void main(String[] args) {

        String str="kdfjsnf od4453675 $^$()#^& SDGSF";
        System.out.println(str.replaceAll("[A-Z]","="));//w/ ever upper case latter is present replace it with "="
        System.out.println(str.replaceAll("[A-C]","="));
        System.out.println(str.replaceAll("[a-z]","="));
        System.out.println(str.replaceAll("[0-9]","="));
        System.out.println(str.replaceAll("[0-9]",""));
        System.out.println(str.replaceAll(" ",""));
        System.out.println(str.replaceAll("[A-z]",""));
        System.out.println(str.replaceAll("[A-Z0-58-9a-j]",""));// for multi rang, no space
        System.out.println(str.replaceAll("[ks2S]",""));
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//^ =not

    }
}
