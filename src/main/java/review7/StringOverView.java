package review7;
//2 different ways for String
//String are immutable, unchangable
public class StringOverView {
    public static void main(String[] args) {

        String phone="iPhone";//phone is a variable

        String color =new String();
        color="yellow";

        String color1=new String("Pink");//this is the one I know


        String sentence="     Today is September 7       ";
        //how many char inside the String
        int size=sentence.length();
        System.out.println(size);

        sentence=sentence.trim();
        System.out.println(sentence);

        String[] words=sentence.split("");
        System.out.println(words[2]);

        String newString= sentence.replace("Today","Tomorrow");
        System.out.println(newString);

        String str1="Hi Hi Friday";
        str1=str1.replace("Hi","Hello");
        System.out.println(str1);

        char letter=str1.charAt(2);
        System.out.println(letter);

        int indexOfCharB=str1.indexOf('B');
        System.out.println(indexOfCharB);

        for (int i = 0; i <12 ; i++) {


        }
    }
}
