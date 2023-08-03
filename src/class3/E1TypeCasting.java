package class3;

public class E1TypeCasting {
    public static void main(String[] args) {
        //byte,short,int,long,float,double; from smallest to biggest
        long age=12323445566L;

        //byte myAge=age;
        byte number=10;
        int number2=number;

        System.out.println(number2);

        //types casting picking from one box and putting it into another one, converting one data type into another one
        // this type og casting is called implicit, widening

        float num1=15.6f;
        int num2;
        num2=(int)num1;
        // 15.6 got lost it only 15 because float is bigger then int
        System.out.println(num2);


    }
}
