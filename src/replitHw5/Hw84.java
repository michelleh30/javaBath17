package replitHw5;

//Write a program that prints the total number of elements that are negative AND odd
//for example -3 is both negative and odd
//3
public class Hw84 {
    public static void main(String[] args) {
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                count++;

                if (a[i][j] < 0 && a[i][j] % 2 != 0) {

                }


            }
            System.out.println(count);
        }


    }
}
