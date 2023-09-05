package class10;
//where using Dog class.java
public class DogTester {
    public static void main(String[] args) {
        //creating an object from the Dog class
        Dog lunaObj=new Dog();//creating an obj from dog class/nameof the obj is luna

        //assigning a value to name using lunaObj
        lunaObj.name="Luna";
        lunaObj.gender='F';
        lunaObj.breed="Poddle";
        lunaObj.weight=20;
        lunaObj.age=7;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);

// we are calling the bark method on lunaObj
        lunaObj.bark();
        // we are calling the eat method on lunaObj
        lunaObj.eat();
        // we are calling the sleep method on lunaObj
        lunaObj.sleep();


    }
}
