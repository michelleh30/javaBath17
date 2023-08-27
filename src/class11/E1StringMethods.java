package class11;

public class E1StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is great.";//this can be a array, each letter has a num
        System.out.println(str.charAt(4));//you want the charater in the 0 which is B
        System.out.println(str.charAt(0));
        int lastIndex=str.length();
        System.out.println(lastIndex);//this will give the total count of elements it will be 18
        System.out.println(str.charAt(str.length()-1));//length gives us number of elements which is 18 thats why we do -1 which is 17. It’s 18 characters but Index start at 0

    }


}
