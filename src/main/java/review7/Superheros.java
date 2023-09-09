package review7;

public class Superheros {
    //this is instance ver.
    String name;
    String power;
    int age;
    char gender;

    Superheros(String name,String power){//this  is local var
        this.name=name;
        this.power=power;
    }
    Superheros(String name, String power,int age){
      this(name,power);//making a call to the CURRENT class constructor
        this.age=age;//accessing CURRENT class instance variables
    }

    public static void main(String[] args) {

        Superheros s =new Superheros("Superman","fly");

        Superheros s2=new Superheros("Batman", "money",25);
        }
    }

