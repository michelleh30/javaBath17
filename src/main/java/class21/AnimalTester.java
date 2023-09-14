package class21;

//use an arry to get all the data
public class AnimalTester {
    public static void main(String[] args) {

        Animal[] arr = {new Cat(), new Dog1()};//array
        for (Animal a : arr) {//loop
            a.speak();
            a.eat();
            a.sleep();
        }

    }
}

