package replitHw8;
/*
omplete static sum2D method by writing an accumulator algorithm that will calculate
the sum of all the element in the 2D array passed as a parameter.
 */
public class Hw151 {
    public static int sum2D(){
        int sum=0;
        int [][] arr={
                {1,2,3,},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                sum=sum+arr[i][j];

            }

        }
        return sum;
    }
}

