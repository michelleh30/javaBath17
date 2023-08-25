package class9;

//
public class E82DArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 20, 30, 40},//1d array
                {15, 30, 35, 45},//1d array
                {16, 20, 32, 22}};//1d array


       // this is enhance for loop
        for(int [] row:numbers){// we need to especifily the datatype,2d araay that have mulit 1d arrays

            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }


}

