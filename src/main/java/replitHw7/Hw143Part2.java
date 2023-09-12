package replitHw7;

public class Hw143Part2 {

        String make;
        String model;
        int numberOfDoors;
        int topSpeed;
        double price;

        Hw143Part2(String make,String model,int numberOfDoors){
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
            topSpeed=90;
            this.price=0;

        }

        Hw143Part2(int numberOfDoors,int topSpeed,double price){
            model="unknown";
            make="unknown";
            this.numberOfDoors=numberOfDoors;
            this.topSpeed=topSpeed;
            this.price=price;

        }

        Hw143Part2(String make,String model,int topSpeed,double price){
            this.make=make;
            this.model=model;
            numberOfDoors=4;
            this.topSpeed=topSpeed;
            this.price=price;

        }

        Hw143Part2(String make,String model,int numberOfDoors,int topSpeed,double price)
        {
            this(make,model,topSpeed,price);
            this.numberOfDoors=numberOfDoors;
            this.price=price;
        }

        void display(){
            System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
        }
    }

    class Main {
        public static void main(String[] args) {
            Hw143Part2 car = new Hw143Part2("Toyota", "Prius", 4, 120, 30000.0);
            Hw143Part2 car1 = new Hw143Part2("Toyota", "Prius", 120, 30000.0);
            Hw143Part2 car2 =new Hw143Part2(4, 120, 30000.0);
            Hw143Part2 car3  =new Hw143Part2("Toyota", "Prius", 4);
            car.display();
            car1.display();
            car2.display();
            car3.display();
        }
    }

