package class11;

public class E1StringMethodsEx {
    public static void main(String[] args) {

        String str="Batch 17 is great.";//this can be a array, each letter has a num
        System.out.println(str.charAt(4));//you want the charater in the 0 which is B
        System.out.println(str.charAt(0));
        int length=str.length();

        System.out.println(str.charAt(str.length()-1));//this is shortcut
        System.out.println("**********");
        int lastIndex=str.length()-1;//line 13-16 is the longer way give to give us "."
        System.out.println(lastIndex);
        char c=str.charAt(lastIndex);
        System.out.println(c);

    }


}
