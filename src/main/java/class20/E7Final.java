package class20;




public class E7Final {
    public static void main(String[] args) {

        final int AGE=10;//final =is no more changes
        //age=20; cant change the vaule
        System.out.println(AGE);
    }
}
class Parent{
    final String color="Red";

    final void marry(){//cant override it what the parent did
        System.out.println("take our perssion first");
    }
}
//class Child extends Parent {
    //@Override
    //void marry(){
        //System.out.println("tI want to marry someone else");
    //}
//}