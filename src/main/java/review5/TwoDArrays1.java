package review5;
////how to get all elements from 2d array?
//array.length in 2d array returns number ofd rows
//array[rows].length in 2d array returns number of colms from that rows
public class TwoDArrays1 {
    public static void main(String[] args) {

        //                    [row][col]
        int [][] array=new int [2][4];//2 rows 3 colmus
        array[0][0]=12;
        array[0][1]=13;
        array[0][2]=14;
        array[0][3]=15;
        array[1][0]=1;
        array[1][1]=2;
        array[1][2]=3;
        array[1][3]=4;

        for (int rows = 0; rows < array.length ; rows++) {//outer loop iterates over rows

            for (int col = 0; col <array[rows].length ; col++) {//inner loop iterates over the columns

                System.out.println(array[rows][col]);
            }


        }




    }
}
