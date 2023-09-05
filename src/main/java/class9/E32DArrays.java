package class9;

import java.util.Arrays;

public class E32DArrays {
    public static void main(String[] args) {


        int [][] numbers={
                {10,20,30,40},
                {100,200,303},
                {100,200,303,400}};

        int [] row=numbers[0];//this prints complete 1D array, whole row
        int number=numbers [0][1];//this print one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1]));//prints out the whole second row




    }
}
