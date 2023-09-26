package projectCodes2;

/*
Q11
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.

Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.

The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */
public class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;

    }

    double calculateSalePrice() {
        return carPrice;
    }

}

class Truck extends Car {
    private int weight;

    public Truck(double carPrice, String color,int weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.10;
        } else {
            return super.calculateSalePrice() * 0.20;
        }
    }
}

class Sudan extends Car {
    private int length;

    public Sudan(double carPrice, String color,int length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.05;
        } else {
            return super.calculateSalePrice() * 0.10;
        }
    }

}
class CarTester{
    public static void main(String[] args) {
        Truck t=new Truck(65000,"Black",6000);
        System.out.println("The price of the Truck is $"+t.calculateSalePrice());

        Sudan s=new Sudan(40000,"Red",14);
        System.out.println("The price of the Sudan is $"+t.calculateSalePrice());

    }
}
