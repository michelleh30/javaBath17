package class15;

public class T1 {
    private String name;

    public T1(String aName){//with parameters
        name=aName;
        System.out.println(name);
    }
    public T1(){
        System.out.println("Executed constructor with no parameters");
    }

    public static void main(String[] args) {
        T1 obj= new T1();
        T1 obj1=new T1("Michelle");

    }
}


