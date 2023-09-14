package class21;
//abstract has to be in the class and methos for it to work
public abstract class Animal {

    abstract void speak();//method are action

    abstract void sleep();

    abstract void eat();

}
class Dog1 extends Animal{
    @Override
    void speak(){
        System.out.println("wuf wuf...");
    }
    @Override
    void sleep(){
        System.out.println("sleeping for 10 hrs");
    }

    @Override
    void eat() {
        System.out.println("Eats bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow meow");
    }

    @Override
    void sleep() {
        System.out.println("cats sleep for 12-16 hrs");
    }

    @Override
    void eat() {
        System.out.println("cats eat fish");
    }
}