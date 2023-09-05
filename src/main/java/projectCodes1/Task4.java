package projectCodes1;
//Create a 2D array of integers. Develop a program which will calculate
//the sum of even and odd numbers for that array.
public class Task4 {
    public static void main(String[] args) {
        int [][] numbers={
                {12,56,67,80},
                {54,60,23,45},
                {2,10,54,78}
        };

        int sum=0;
        for (int i = 0; i < numbers.length; i++) {//rows
            for (int j = 0; j < numbers[i].length; j++) {//col
                sum=sum+numbers[i][j];

            }

        }
        System.out.println(sum);
    }
}
