package replitsHw8;
/*
In parent class
Create a non argument constructor and write a logic to print "This is Parent constructor"
Create a Child Class that will be subclass of the Parent class.
Create a constructor without parameter and call parent class constructor expicitly
In Main Class.
Create and object of Child class and run the application.
**Expected Output:**
This is Parent constructor
 */
public class Hw153 {
    String sen;

    public Hw153(String sen){
        this.sen=sen;
    }
    void printInfo(){
        System.out.println(sen);
    }
    class Child extends Hw153{

        public Child(String sen) {
            super(sen);
        }
    }
    class Hw153Tester {
        public static void main(String[] args) {
            Hw153 s1 = new Hw153("This is Parent constructor");
            s1.printInfo();
        }
    }
}
