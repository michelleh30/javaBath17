package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {


        //Integer number=new Integer(10);//class type
        //Integer number2=10;
        //int d=number2.intValue();//this will give you back the int, converting from a class to primitive
        //System.out.println(d);//the whole thing is called unboxing

        int a=10;
        Integer number=new Integer(a);
        int d=number.intValue();
        System.out.println(d);

        Integer c=10;//AutoBoxing
        int f=c;// AutoUnBoxing
        System.out.println(f);

    }
}
