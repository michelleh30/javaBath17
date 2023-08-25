package class7;

// #####
// ## ##
// ## ##
// #####
// its ok if i dont know this its too hard right now
public class T8NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {//how many rows we want
            for (int j = 1; j <= 6; j++) {
                if (i == 2 && j == 3 || i == 3 && j == 3
                        || i == 2 && j == 4 || i == 3 && j == 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }

            }
            System.out.println();

        }
    }

}





