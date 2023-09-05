package class11;
//Create a String and print it in reverse order
//KNOW HOW TO DO THIS FOR THE INTERVIEW
//last index is always -1 of the length
public class T2 {
    public static void main(String[] args) {

        String word="Valentina";
        for (int i = word.length()-1; i >=0 ; i--) {//i-- will go backword
            System.out.print(word.charAt(i));

        }

    }
}
