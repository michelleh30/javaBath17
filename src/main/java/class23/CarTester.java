package class23;

public class CarTester {
    public static void main(String[] args) {

        Car car=new Car("Chevy","Camero",2000);

        car.setYear(2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());


    }
}
