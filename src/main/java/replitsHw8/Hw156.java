package replitsHw8;
/*
Create class A
declare variable int i=10;
Create class B  extends A
declare variable int i=20;
create a method to display value of variable i from both classes
In Main Class create an object of subclass and call method display
**Expected Output:**
20
10
 */
public class Hw156 {
    public Hw156(int number){
        System.out.println(number);
    }

}
class B1 extends Hw156{

    public B1(int number) {
        super(number);
    }
}
class Hw156Tester{
    public static void main(String[] args) {
        B1 Obj1=new B1(20);
        Hw156 Obj2=new Hw156(10);
    }

}
