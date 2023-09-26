package class25;

import java.util.LinkedList;

public class E6LinkedList {

    public static void main(String[] args) {
        LinkedList<Dog>dogs=new LinkedList<>();
        dogs.add(new Dog("luna","poodle"));//calling the constuctoer,creating obj of dog class, adding to the linklist
        dogs.add(new Dog("rambo","pitbull"));
        dogs.add(new Dog("coco","mix"));
        //getting the obj stored in index 2 and storing it inside the d var
        Dog d=dogs.get(2);
        d.printInfo();

    }
}
class Dog{
    String name;
    String breed;//files

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    void printInfo(){
        System.out.println(name+" "+breed);
    }
}