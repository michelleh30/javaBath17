package class7;
// print only the even number
public class Task2 {
    public static void main(String[] args) {
        int []numbers={20,24,48,69,60};
        for (int i = 0; i < numbers.length ; i+=2) {//i+=2 gets even number
            //if(numbers[i]%2==0){ would be better, why?
            //if(numbers[i]%2!=0){ will print odd numbers
            System.out.println(numbers[i]);
        }



    }
}
