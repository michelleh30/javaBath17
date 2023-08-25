package class7;
// only creating the array, *different way of making a array*, were sre not putting any value in the array
//empty array that contains 0 value
public class E12Arrays {
    public static void main(String[] args) {

        int []prices=new int[5];//needs size, how many value are there
        prices[0]=1000;
        prices[2]=250;
        prices[2]=234;//it will override it and 234 will become the price[2]

        System.out.println(prices[2]);


    }

}
