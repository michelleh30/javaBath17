package class7;
// ex. for easier E1NesterLoop
public class E2NestedLoopExE1 {
    public static void main(String[] args) {

        //nested loop


        for (int i = 0; i < 2; i++) {//this code will repeat 7x b/c i<7; control how many line to print

            for (int j = 0; j < 10; j++) {//this print one line of code
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
