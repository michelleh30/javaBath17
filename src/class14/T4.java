package class14;
//create a method that will accept a String as a parameter and
// return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and
// executed by calling its name.
public class T4 {
    public static void main(String[] args) {
        System.out.println(getVowels("YerbolBadBoy"));
    }
    private static String getVowels(String str){
        return str.replaceAll("^aeiouAEIOU","");
    }

}
