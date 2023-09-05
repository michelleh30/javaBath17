package class7;
// add all the number from the array and print the sum at the end.
public class T11Array {
    public static void main(String[] args) {
        int [] numbers={20,10,50,30,40};//should print out 150

        int sum=0;//put 0 because it will not affect the result
        for (int i = 0; i <numbers.length ; i++) {
            sum = sum + numbers[i];// pick the previous value of sum and add it to current value of the array
        }
            System.out.println(sum);
            }
        }


