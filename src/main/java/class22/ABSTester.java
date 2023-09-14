package class22;

public class ABSTester {
    int age;
    ABSTester(){

    }
}
interface A{
    //int age; not allow
    private void tester(){//yes we can have

    }
}
class Tester{
    public static void main(String[] args) {
        ABSTester a=new ABSTester();

    }
}