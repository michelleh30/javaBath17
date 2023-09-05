package class15;

public class DogTester {
    public static void main(String[] args) {

        Dog d1=new Dog("luna","poodle","white",8);//obj1
        d1.printInfo();
        /*
        1.name="Luna";// you are allowing anyone using the code,
        when you make them private this code doesnt work you have to make a constructor
        d1.breed="poodle";
        d1.color="white";
        d1.age=8;
        //d1.printInfo(); classing the method

        */

        Dog d2= new Dog("Rambo","mix","black",10);
                d2.printInfo();





    }
}
