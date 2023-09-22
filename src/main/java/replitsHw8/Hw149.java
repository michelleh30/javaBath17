package replitsHw8;
/*
Create Three classes (Main, A,B ):
Have a method that prints out the following
For A:  "Class A"
For B:  "Class B"
Make B extend A
From your Main class create an object of the B class and call the methods.
Output:
Class A
Class B
 */
public class Hw149 {
    private String name;

    public Hw149(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println(name);
    }
}
class Hw149Tester {
    public static void main(String[] args) {
        //Main m1 = new Main("Class A");
        //m1.printInfo();

        //Main m2 = new Main("Class B");
        //m2.printInfo();
    }
}

