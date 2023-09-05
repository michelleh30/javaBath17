package class9;

//prints out 2d arrays
public class E72DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},
                {15, 30, 35, 45},
                {16, 20, 32, 22}};

        for (int row = 0; row < numbers.length; row++) {//rows
            for (int col = 0; col < numbers[row].length; col++) {//columa
                System.out.print(numbers[row][col] + " ");

            }
            System.out.println();

        }

    }


}

