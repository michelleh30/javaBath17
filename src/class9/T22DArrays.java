package class9;
//write a loop to get all the elemets from the second row one by one
public class T22DArrays {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40,50},
                {15,30,35,45,20 },
                {16,20,32,22,30 }};

        for (int row = 0; row <5 ; row++) {// theres 3 rows
            System.out.println(numbers[row][1]);//1st [] is for rows 2[] for colums/ this will print out 20 30 20

        }


    }
}
