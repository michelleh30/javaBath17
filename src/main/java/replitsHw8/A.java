package replitsHw8;
/*
1. Create three classes (A, B, C)
Write two constructors:
* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"
Make C extend B
and B extend A
From your Main class create an object of the C class.
**Expected Output:**
I

am

a tester
 */
public class A {
    protected String a;
    public A(String a){
        this.a=a;

    }
    void printInfo(){
        System.out.println(a);
    }
    class B extends A{
        String b;

        public B(String a){
            super(a);
            this.b=b;

        }

    }



}
