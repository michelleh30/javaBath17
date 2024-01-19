package class21;


public class Vehicle {
    public void go(){

    }


}
class Car extends Vehicle{
    @Override
    public void go(){
        System.out.println("the car begins moving");
    }

}
class Bicycle extends Vehicle{
    @Override
    public void go(){
        System.out.println("the bicycle begins moving");
    }

}
class Boat extends Vehicle{
    @Override
    public void go(){
        System.out.println("the boat begins moving");
    }

}

