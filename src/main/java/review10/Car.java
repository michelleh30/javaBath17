package review10;
//go with a interface becuase they are not connceted in any way(car and horse)
public class Car implements Washable {
    public void drive(){
        System.out.println("driving....");
    }
    @Override
    public void wash(){
        System.out.println("you can take a car to a carwash");
    }
}
class Horse implements Washable{
    @Override
    public void wash(){
        System.out.println("horse can be wash");
    }
}
