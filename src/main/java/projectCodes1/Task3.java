package projectCodes1;
//Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even
//numbers only.
public class Task3 {
    public static void main(String[] args) {
        int [][] numbers= {
                {10, 15, 20},
                {76, 75, 78},
                {30, 32, 35}
        };

        for (int i = 0; i < numbers.length ; i++) {//rows
            for (int j = 0; j <numbers[i].length ; j++) {//col
                if(numbers[i][j] % 2==0){
                    System.out.print(numbers[i][j] +" ");
                }

            }
            System.out.println();
        }
    }
}
