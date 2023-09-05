package class7;
//Create an array on integers and calculate the sum of all elements in an array
public class Hw6 {
    public static void main(String[] args) {

        int []numbers={5,10,15,20,25};//75
        int sum=0;
        for (int i = 0; i <numbers.length ; i++) {
            sum= sum+numbers[i];

        }
        System.out.println(sum);
    }
}
