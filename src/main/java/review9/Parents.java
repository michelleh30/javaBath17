package review9;

public class Parents{
    String name="James";

    void printHello(){//methods
        System.out.println("Hello world");
    }
    Parents(){
        System.out.println("Parents class contructors");
    }
    Parents(String n){
        System.out.println("Parents class with parameter");

    }
}
class Child extends Parents {
    //String name="John";//by dewful this will print out, instance var

    void printHello() {
        System.out.println("Hello Java");
    }

    void test() {
        String name = "White";//local var
        System.out.println(super.name);//put super so that the parent will print out
        System.out.println(this.name);//calling the instance var
        System.out.println(name);//when we simply write name it be defult
    }

    void methodTest() {
        super.printHello();//Hello World, super everything from the parent
    }

    public Child() {
        super("name");
    }
}