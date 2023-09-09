package class19;
//same as take 2 but with private
public class Animal {
    private String name;
    private String color;
    private int age;

    int num=10;//this will print out from the parents

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void printInfo(){//no paramenter
        System.out.println(name+" "+color+" "+age);
    }

}
class Dog extends Animal{
    int sum=20;
    double weight;



    public Dog(String name, String color, int age , double weight) {
        super(name, color, age);
        this.weight=weight;
    }

    public void printInfo(){//if everything the same java is going to call the method from your class
        //System.out.println("my own Methods");//this will print out b/c its last and not from the parents
        super.printInfo();//calling the method from the parent
        System.out.println(weight);//this was missing, override the method to get weight

    }

}
