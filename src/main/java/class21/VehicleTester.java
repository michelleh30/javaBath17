package class21;
/*
brocode youtube
poly is the ability of an obj to id as more than one type
car, bike and boat identity as vehicle
 */
public class VehicleTester {
    public static void main(String[] args) {

        Car car=new Car();
        Bicycle bicycle=new Bicycle();
        Boat boat=new Boat();
        //array
       Vehicle[] racers={car,bicycle,boat};
        //for loop
       for(Vehicle x: racers){
           x.go();
       }
    }
}
