package class18;
//this mean instance varible
// when the feild are private there hads to be a construer
public class Car {
    private String make;//this is instance varible/ feils
    private String model;
    private double price;
    private String color;


    public Car(String make,String model,double price,String color){
        this.make=make;
        this.model=model;
        this.price=price;
        this.color=color;
        //this is a constructor

    }
    void printInfo(){//this is methods
        System.out.println(make+" "+model+" "+price+" "+color);
    }

}
class BMW extends Car{
    public BMW(String make,String model,double price,String color){
        // calling the construtor from the parent class, to initialize the fields use super
        super(make,model,price,color);//this is matching at lest one constructor from the parent class
    }

}
class Audi extends Car{
    boolean sunRoof;
    public Audi(String make,String model,double price,String color){
        super(make,model,price,color);
        //this.sunRoof=sunRoof;
    }

}
