package class10;

public class CarTester {
    public static void main(String[] args) {

        Car bmw=new Car();
        bmw.brand="BMW";
        bmw.color="Red";
        bmw.value=80000;

        System.out.println(bmw.brand);
        System.out.println(bmw.color);
        System.out.println(bmw.value);

        bmw.drive();
        bmw.applyBrakes();





    }

}
