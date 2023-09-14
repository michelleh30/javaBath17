package replitHw7;
/*
Returns:a String
Name:thirdLetter
Parameters:a String called s
Then complete the method by programming the following behavior

Returns every 3rd letter of the String s,
starting from the first letter.
See below examples.
Examples:

thirdLetter("hello there") ==> "hltr"
 */
public class Hw131 {
    static String thirdLetter(String s){
        String str=" ";

        for (int i = 0; i < s.length(); i+=3) {
            str= str + s.charAt(i);

        }
        return str;
    }
}
