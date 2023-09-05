package class15;
// why private?no one can change it no other class can access it
//concrt must have the same name as class
public class Car {
    private String make;
    private String model;
    private String color;
    private double price;

    //this is construt
    public Car(String cMake,String cModel, String cColor,double cPrice ){
        make=cMake;
        model=cModel;
        color=cColor;
        price=cPrice;
    }
    public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }
    void setPrice(double cPrice){//it's setting the cPrice variable to Price
        price=cPrice;
    }
    double getPrice(){

        return price;
    }

}
