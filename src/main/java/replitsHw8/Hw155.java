package replitsHw8;
/*
. Create three classes (A, B, C)
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
public class Hw155 {
    public Hw155(){
        System.out.println("I");
    }
}
class B extends Hw155{
    public B(){
        super();
        System.out.println("am");
    }
}
class C extends B{
    public C(){
        super();
        System.out.println("a tester");
    }
}
class Hw155Tester{
    public static void main(String[] args) {
        C obj1=new C();
    }
}