package class11;
//How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
public class Hw5 {
    public static void main(String[] args) {

        String word="This is sentence i want to reverse";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i)+"");

        }
    }
}
