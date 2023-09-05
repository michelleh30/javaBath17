package projectCodes1;
//Create a program that uses an array to store a list of temperatures for
//a week, and then uses a loop to find the highest and lowest
//temperature for the week.
public class Task1 {
    public static void main(String[] args) {

        int [] temp={88,93,83,85,87,92,80,78};
        int largestNumber=temp[0];
        int smallestNumber=temp[0];

        for (int i = 0; i < temp.length ; i++) {

            if (temp[i]>largestNumber){
                largestNumber=temp[i];
            }

        }
        System.out.println(largestNumber);

        for (int i = 0; i < temp.length ; i++) {
            if(temp[i]<smallestNumber){
                smallestNumber=temp[i];
            }
        }
        System.out.println(smallestNumber);


    }
}
