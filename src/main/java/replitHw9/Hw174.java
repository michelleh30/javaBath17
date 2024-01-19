package replitHw9;
/*
Create an Interface with name as MyInterface
Create two undefined methods method1 and method2
Inherit the MyInterface to Main Class.
Execute both methods
**Expected Output:**

implementation of method1
implementation of method2

 */
interface MyInterface {
    public void method1();
    public void method2();
}
class ImpInterface implements MyInterface{


    public void method1() {
        System.out.println("implementation of method1");

    }


    public void method2() {
        System.out.println("implementation of method2");

    }

    public static void main(String[] args) {
        MyInterface obj=new ImpInterface();
        //calling the implemented methods
        obj.method1();
        obj.method2();
    }
}
