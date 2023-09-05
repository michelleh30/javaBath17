package replitHw5;
//Write a program that sums all numbers that are on even index and on even row.
//-4
//if i %2 == 0 and j % 2 == 0
public class Hw85 {
    public static void main(String[] args) {
        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}
        };

        int sum=0;
        for (int i = 0; i <a.length ; i+=2) {
            for (int j = 0; j < a[i].length; j+=2) {
                sum=sum+a[i][j];

            }

        }
        System.out.println(sum);



    }
}
