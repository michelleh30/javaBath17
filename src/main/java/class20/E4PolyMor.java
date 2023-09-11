package class20;

public class E4PolyMor {
    public static void main(String[] args) {
        /* Animal a=new Animal();
        a.speak();
        a.sleep();
        a.eat();
        Dog d=new Dog();
        d.speak();
        d.sleep();
        d.eat();
        Cat c=new Cat();
        c.speak();
        c.eat();
        c.sleep();*/

        Animal a = new Dog();
        Animal[] arr = {new Dog(), new Cat(), new Animal()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].sleep();
            arr[i].speak();

        }
    }
}
