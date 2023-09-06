package class17;
//this is multilevel
//A cant access C

public class A {
    String name;

    void printName(){
        System.out.println(name);
    }

}

class B extends A{

    String color;
    void printColor(){
        System.out.println(color);
    }
}
class C extends B{

    void printNameColor(){
        System.out.println(name+" "+color);//this is from grandparent and parents
    }
}
class D extends B{

}
