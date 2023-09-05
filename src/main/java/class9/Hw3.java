package class9;
//Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
// Develop a program which will identify/print the even numbers only.
public class Hw3 {
    public static void main(String[] args) {
        int [][] numbers={
                {67,34,56,90},
                {34,22,90,11},
                {43,21,78,92}
        };

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(numbers[i][j] % 2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
