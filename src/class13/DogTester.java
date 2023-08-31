package class13;
//instance var
public class DogTester {
    public static void main(String[] args) {

        Dog d1=new Dog();
        d1.name="diva";
        d1.breed="poodle";
        d1.age=12;

        Dog d2=new Dog();
        d2.name="sus";
        d2.breed="golden";
        d2.age=22;

        d1.printInfo();
        d2.printInfo();

    }

}
