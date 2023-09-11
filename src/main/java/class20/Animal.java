package class20;

public class Animal {
    void speak(){//method
        System.out.println("Animals can speak");
    }
    void sleep(){
        System.out.println("Animal sleep");
    }
    void eat(){
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("woof woof");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow moew");
    }
}

