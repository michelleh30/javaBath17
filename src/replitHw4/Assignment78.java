package replitHw4;
//Create an int array of integers with a size of 5 and input values with Scanner.
//
//Don't print prompt questions for a user.
//
//Using loop print out each element of the array that should look like the output below
import java.util.Scanner;

//almost the same as74
public class Assignment78 {
    public static void main(String[] args) {

        int []array=new int[5];

        Scanner scan=new Scanner(System.in);

        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        for(int i=0;i<array.length;i++){

            System.out.println(array[i]+"0");

        }
    }
}


