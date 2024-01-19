package class23;

public class Car {
//this are hidden and are only able to this class
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    //getter method for each private variable
    //to retrieve use getter method
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //change or set use set method
    public void setMake(String make){
        this.make=make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setYear(int year){
        this.year=year;
    }


}
