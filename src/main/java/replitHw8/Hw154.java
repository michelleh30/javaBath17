package replitHw8;

public class Hw154 {

    public Hw154(){//no-argument constructor
        System.out.println("Parent Constructor without argument");
    }
    public Hw154 (int number){//one parameter
        System.out.println(number);
    }

}
class Child1 extends Hw154{
    public Child1(){
        super();
        System.out.println("Child Constructor without argument");
    }
}
class Hw154Tester{
    public static void main(String[] args) {
        Child obj1=new Child();
        Hw154 obj2=new Hw154(10);
    }
}

