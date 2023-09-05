package replitHw5;

//Write a program to print values from a 2D array
//
//1.4 2.0 3.3 2.0
//4.0 1.5 6.1 1.0
//1.2 3.1 4.0 1.6
public class Hw79 {
    public static void main(String[] args) {
        double[][] numbers = {
                {1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}

        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();

        }
    }

}

