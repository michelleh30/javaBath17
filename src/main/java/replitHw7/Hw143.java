package replitHw7;
/*
Create the following variable (**Choose proper datatype**)
* make
* model
* numberOfDoors
* topSpeed
* price

following the proper naming convention for variables.

Write four constructors:
* The first constructor(with all parameters)
* A secondary constructor Have all parameters **except numberOfDoors.
(**numberOfDoors value should assign to 4 inside constructor)
* A third constructor Have all parameters **except make and model .
** **(**make and model value should assign to "unknown" inside constructor)

* A fourth constructor Have all parameters **except topSpeed and price**;
**(**topSpeed value should assign to "90" and price value should be assign to 0
inside constructor)

Create a display method in Cars class to print the class variable value in console.

2. Test your code with the Main.java class:
Create several Car objects using all Constructors.
then call display method with each object.

 */
public class Hw143 {
    private String make;
    private String model;
    private int numberOfDoors;
    private int topSpeed;
    private double price;

    public Hw143(String make,String model,int numberOfDoors,int topSpeed,double price ){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }

    void printInfo(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Hw143 c1=new Hw143("Toyota","Prius",4,120,30000.0);
        c1.printInfo();

        Hw143 c2=new Hw143("Toyota","Prius",4,120,30000.0);
        c2.printInfo();

        Hw143 c3=new Hw143("Unknown","Unknown",4,120,30000.0);
        c3.printInfo();

        Hw143 c4=new Hw143("Toyota","Prius",4,90,0);
        c4.printInfo();
    }



}
