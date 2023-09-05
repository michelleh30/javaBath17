package class13;

public class E2InstanceVarTester {
    public static void main(String[] args) {
        System.out.println("Linel1");
        System.out.println(E2InstanceVar.country);//this is conncted to the static String country = "Uganda";
        System.out.println();




        E2InstanceVar e2=new E2InstanceVar();
        e2.printAge();

    }
}
