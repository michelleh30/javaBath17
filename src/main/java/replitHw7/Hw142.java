package replitHw7;
/*
Include the following class variables:

* schoolName(String)

* batch(int)

* year(int)

* lastDayOfClass(String)

Write two constructors:

* non-argument constructor

* parameterized constructor

Create method to display values of instance variables.
 */
public class Hw142 {
   private String schoolName;
    private int batch;
    private int year;
    private String lastDayOfClass;

    public Hw142(){//non-argument constructor

    }

    public Hw142 (String schoolName,int batch,int year,String lastDayOfClass ){//parameterized constructor
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;

    }
    void printInfo(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }

    public static void main(String[] args) {
        Hw142 obj1=new Hw142();
        obj1.printInfo();

        Hw142 obj2=new Hw142("Syntax",6,2020,"07/30/2020");
        obj2.printInfo();

    }


}
