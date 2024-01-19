package review11;
/*
wrapper classes
 */
public class E1WrapperClasses {
    public static void main(String[] args) {

        int a=10;

        double b=a;
        System.out.println(b);
        //we converted the datatype from int to double--widening implicit auto

        int f=30;

        Integer g=f;
        System.out.println(g);//converted datatypes from primitive int to rept Integer

        double u=30.5;// primitives
        Double t=u;//= wrappers, this Double is a class
        System.out.println(u);//this is boxing

        String name="mcihelle";//spcial treatment for String

        Boolean o=false;//o is a class-wrapper
        boolean s=o;//s is a primitive
        //when wrapper goes to primitives its called unboxing



    }
}
