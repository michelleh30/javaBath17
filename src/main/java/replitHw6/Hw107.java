package replitHw6;

//Given String = "Hello Friends"
//sdneirF olleH
public class Hw107 {
    public static void main(String[] args) {
        String str = new String("Hello Friends");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + "");

        }

    }
}

