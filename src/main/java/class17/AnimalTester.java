package class17;
//defult con ias the one that java creates and its hidden
//tester class, we're creating objects of child class and
// depending on what obj we'[re calling -we're receiving different outputs
public class AnimalTester {
    public static void main(String[] args) {

        Cat c=new Cat();//call to the construter
        c.name="Coco";//its inside the animal class
        c.breed="mix";
        c.age=18;
        c.color="gray";
        c.attitude=true;
        c.printInfo();

        Dog d=new Dog();
        d.bark();
        d.name="Tommy";
        d.breed="Golden";
        d.printInfo();

        Animal a=new Animal();
        a.name="Rose";
        a.color="black";
        a.printInfo();


    }
}
