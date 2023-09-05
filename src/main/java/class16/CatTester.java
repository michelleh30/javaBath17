package class16;

public class CatTester {
    public static void main(String[] args) {
       Cat c1=new Cat("coco", "black",18);
       c1.printInfo();

       Cat c2=new Cat("cookie","orange", 7, 22);
       c2.printInfo();

       Cat c3=new Cat("luna","white", 5,15,'M');
       c3.printInfo();
    }
}
