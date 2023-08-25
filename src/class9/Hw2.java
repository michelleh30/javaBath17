package class9;
//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
// Print the sum of all numbers.
public class Hw2 {
    public static void main(String[] args) {

        int [][] numbers={
                {23,45,60},
                {10,15,20},
                {28,80,56}
        };

        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                sum=sum+numbers[i][j];
            }
        }
        System.out.println(sum);
    }
}
