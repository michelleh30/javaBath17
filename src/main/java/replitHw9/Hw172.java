package replitHw9;
/*
Create a Parent Class in which you will have 1 implemented method m2 and 1 unimplemented method m1

Make Main class to be a derived class from Parent.

In main method execute both methods

**Expected Output:**

```
Child class providing implementation
Parent class providing implementation
 */

 abstract class Parent1{
     abstract void m1();//not being implemented

    abstract void m2(String para);
}
class Main1 extends Parent1{

    @Override
    void m1() {//still not implemented
        System.out.println("Child class providing implementation");
    }

    @Override
    void m2(String parameter) {
        System.out.println("Parent class providing implementation");

    }

}
public class Hw172 {
    public static void main(String[] args) {
        Main1 m=new Main1();
        m.m1();
        m.m2("para");


    }
}
