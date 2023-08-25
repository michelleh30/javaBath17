package class9;
//print out the whole 2 d array
public class E42DArrays {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {15,30,35,45},
                {16,20,32,22}};

        for (int row = 0; row  < numbers.length; row ++) {//theres 3 rows
            for (int col = 0; col <numbers[row].length ; col++) {//4 colmus/elements
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();

        }
    }
}
