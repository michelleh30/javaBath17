package review2;

public class E1TypeCasting {
    public static void main(String[] args) {

        int number=(int)455.555;
        System.out.println(number);//will lose the .5 trying to put a bigger box into a small box

        float number2=20.100f;
        double number3=number2;
        System.out.println(number3);//has been converted float to a double

        //boolean bool=(boolean)12.5; error
        char c=(char)169; //explicit--the aski table 
        System.out.println(c);
        // String s=(String)'C';

    }

}
