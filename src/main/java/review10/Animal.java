package review10;
/*
void speak(){// we need these method for poly
        System.out.println("Animals speak");
    }
    we can remopve the body
 */
public class Animal {
     void speak(){// we need these method for poly
         System.out.println("animal speak");
    }
     void eat(){
         System.out.println("animal eat");
    }
}
class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("wuff wuff ");
    }

    @Override
    void eat() {
        System.out.println("Dogs like to eat bones");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        System.out.println("meow");
    }

    @Override
    void eat() {
        System.out.println("Cats like fish");
    }
}
