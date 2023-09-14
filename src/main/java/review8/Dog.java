package review8;

public class Dog {
    String name;//instance
    String color;//instance
    String breed;//instance this is obj


    //private final Dog(){ Can we use Static with construtor? No

    //}

    public Dog(){//this is also a consterter


    }
    public static Dog getInstance(){//everyone can use it,
        Dog d=new Dog();

        return d;
    }


    public void add(int num1,int num2){
        int sum=num1+num2;//local var
        System.out.println(sum);
    }


}
class DogTester{
    public static void main(String[] args) {

        Dog d=new Dog();//1 obj-instance var
        d.name="lucy";
        d.color="blue";

        Dog d2=new Dog();//2 obj-instance var
        d2.name="Tom";
        d2.color="Black";
    }


}