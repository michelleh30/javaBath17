package replitHw5;

public class CarTester {
    public static void main(String[] args) {
        Car BMW= new Car();
        BMW.color="Black";
        BMW.year=2019;
        BMW.make="BMW";

        System.out.println("Car color is "+BMW.color+" and car year is "+BMW.year+" and car model is "+BMW.make);


        Car Toyota=new Car();
        Toyota.color="White";
        Toyota.year=2018;
        Toyota.make="Toyota";

        System.out.println("Car color is "+Toyota.color+" and car year is "+Toyota.year+" and car model is "+Toyota.make);


    }

}
