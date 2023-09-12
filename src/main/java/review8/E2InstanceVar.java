package review8;

public class E2InstanceVar {

    String name="jam";//instance var

    void printName(){//instance
        System.out.println(name);

    }
    static void pribtInfo(){//static
        //System.out.println(name);//

    }

    public static void main(String[] args) {
        E2InstanceVar e1=new E2InstanceVar();//obj
        e1.name="jam";

        E2InstanceVar e2=new E2InstanceVar();//obj
        e2.name="scam";

        E2InstanceVar.pribtInfo();

        //only need the name of the class to make an obj to print
        //every obj

    }
}
