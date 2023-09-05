package class16;

public class Person {
    //make sure that the feils are private b/c they store data, you should have total control of your data
    //private over every variable
    //instance variable
    private String name;
    private int age;
    private double weight;
    private char gender;

    private int salary;
    private String hairColor;

    public Person(){

    }

    public Person(String Name,int Age, double Weight) {//there are parameter, local varibale
        this.name = Name;//use this when you want instance variable and parameter to have the same name
        this.age = Age;
        this.weight = Weight;

    }
    public Person(String Name,int Age, double Weight, char Gender) {//there are parameter, local varibale
        this.name = Name;//use this when you want instance variable and parameter to have the same name
        this.age = Age;
        this.weight = Weight;
        this.gender = Gender;
    }
    public Person(String Name,int Age, double Weight, char Gender, int Salary, String HairColor) {//there are parameter, local varibale
        /*this.name = Name;//use this when you want instance variable and parameter to have the same name
        this.age = Age;
        this.weight = Weight;
        this.gender = Gender;
         */
        this(Name,Age,Weight,Gender);//this must be the first line in the constructer to work, to save space
        this.salary = Salary;
        this.hairColor = HairColor;
    }
    //method
    public void printInfo(){
        //String name="Gia"; local veritable have more perorattiy that why this will print
        System.out.println(this.name+" "+age+" "+weight+" "+gender+" "+hairColor);//this are instance variable
        //b/c i put this.name michelle will print out im telling java to use instance variable
    }
}

