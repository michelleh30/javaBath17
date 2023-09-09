package class19;
/*Create a class 'Degree' having a method 'getPrerequisite' that prints "
"To get a degree you need high school diploma"".
Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’.
In Masters class override method 'getPrerequisite'.
Call the method by creating an object of each of the three classes.

 */
public class Degree {
    public void getPrerequisite() {//the same
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{//in some case you dont need to override

    }

class Masters extends Degree{
    @Override//we need to have the same method to override
    public void getPrerequisite(){//the same
        System.out.println("You will get a master if you have a bachelor degree");
    }

    void check(){

    }

}
class Tester{
    public static void main(String[] args) {
        Degree obj2 = new Degree();
        obj2.getPrerequisite();
        Bachelors obj1 = new Bachelors();
        obj1.getPrerequisite();
        Masters obj = new Masters();
        obj.getPrerequisite();


    }
}
