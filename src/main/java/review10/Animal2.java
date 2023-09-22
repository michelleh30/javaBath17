package review10;
//abstract
public abstract class Animal2 {
    abstract void speak();// we need these method for poly

     abstract void eat();

    }

class Dog2 extends Animal2{
    @Override
    void speak() {
        System.out.println("wuff wuff ");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat2 extends Animal2{
    @Override
    void speak() {
        System.out.println("meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like fish");
    }
}
