package class8;
// count how many number are greater than 10
public class T3Arrays {
    public static void main(String[] args) {
        int []numbers={10,20,4,3,8,45,96};

        int count=0;//better to put 0, always put it outside the loop

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]>10){//greater than 10
                count++;
            }
        }
        System.out.println(count);
    }
}
