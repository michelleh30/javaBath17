package class15;
//constructer
//when its private you need to have a contructer
public class Dog {
//instance varible, 99% of the time is private, instance feild in the class to store data relate to the obj to share all the method to the class
    //why private?having more control of the data
    private String name;
    private String breed;
    private String color;
    private int age;




    // Constructor
    // 99% of the time constructors are public
    // Constructors has the same name of as the class
    public Dog(String dName, String dBreed, String dColor,int dAge){//this is constructor and its public
        name=dName;
        breed=dBreed;
        color=dColor;
        age=dAge;
        bark();
//same name of class and no void that when you know its a constructor
    }
    public Dog(String dName, String dBreed, String dColor){
        name=dName;
        breed=dBreed;
        color=dColor;
    }

    public void bark(){
        System.out.println("wuff wuff...");//this is a behavour

    }
   public void printInfo(){
        System.out.println(name+" "+breed+" "+color);
    }

}
