package replitHw8;

/*
In Parent Class.
Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
Create another constructor that takes one parameter of integer type called number.
include the logic to print the value of the number.
**********
In Child class.
Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
Overload the constructor by adding one parameter of type integer
Inside the constructor call the parameterized parent class constructor.
**********
In Main Class.
Create an object of Child without passing any argument.
And then another object of Child class by passing the value "10". run the application.
 */
public class Parent {
    // instance variable
    private int number;

    //non-parameterized constructor that also display
    public Parent() {
        System.out.println("Parent Constructor without argument");
    }
    // parameterized constructor that also prints the value of parameter
    public Parent(int number) {
        this.number = number;
        System.out.println(number);
    }
}
class Child extends Parent {

    public Child() {
        super (); //in our Child class, if we don't include super();
        // in the non-parameterized constructor, it will still be there implicitly,
        // and the non-parameterized constructor of the Parent class will be called before the code
        // in the Child class's constructor is executed.
        System.out.println("Child Constructor without argument");
    }
    public Child(int number) {
        super(number);
    }
}
