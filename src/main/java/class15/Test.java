package class15;

public class Test {
    Test(){
        System.out.println("1");
    }
    Test(String name){
        System.out.println("1");
    }
    Test(int age){
        System.out.println("1");
    }
    Test(String name, int age) {
        System.out.println("1");

    }
    Test(int age,String name) {
        System.out.println("5");

    }

    public static void main(String[] args) {
        Test t=new Test("Michelle",30);



    }
}
