package class16;
//Create Cat class define 6 fields create multiple constructors to give
//flexibility to the end user. PrintInfo method as well to print all the details of
//a cat.
public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private char gender;

    public Cat(String name, String color,int age) {
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public Cat(String name, String color,int age,double weight){
        this(name,color,age);
        this.weight=weight;
    }

    public Cat(String name, String color,int age,double weight,char gender){
       this(name, color, age, weight);
        this.gender=gender;

    }


    public void printInfo(){

        System.out.println(name+" "+color+" "+age+" "+weight+" "+gender);
    }


}
