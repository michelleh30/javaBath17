package class7;

public class E3NestedLoop {
    public static void main(String[] args) {

        //nested loop


        for (int i = 0; i < 2; i++) { //how many lines will be printed

            for (int j = 0; j < -1; j++) {
                System.out.print("+");//because this code fails the outer code is going to print
            }
            System.out.println("@");// this one is going to print
        }
    }
}
