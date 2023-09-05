package class16;
//Write a java class that have 4 constructors with 4
// different access levels of constructors(private,public,default,protected)
// and create 4 objects of this class:
// 1 - inside same class; 2 - from outside the class; 3 - from different class inside
// different package  and observe result.
//this is a constructor with different level of access
public class Constructor {
    private Constructor(){
        System.out.println("Private");
    }

    Constructor(String name){
        System.out.println("Default");
    }

    protected Constructor(int age){
        System.out.println("protected");
    }

    public Constructor(double weight){
        System.out.println("public");
    }

    public static void main(String[] args) {

        new Constructor();
        new Constructor("dnfdkj");
        new Constructor(1512);
        new Constructor(10.52155);
    }
}
