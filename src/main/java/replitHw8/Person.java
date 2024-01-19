package replitHw8;
/*
Create Three classes (Person, Employee, Tester)
* Have properties
For Person: firstName(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Tester: programming languages(int)
At Employee, Tester,  Class have a print method in each that prints the properties
in line as shown in the output
Create multilevel inheritance: Person --> Employee --> Tester
From your Main class create objects of the Employee, Tester classes
and call the print method.
**Expected Output:**

Joe Smith 35 35000
Adam Smith 15 java

 */
public class Person {
     String firstName;
    String lastName;
     int age;

    public Person(String firstName, String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public void printInfo(){
        System.out.println(firstName+" "+lastName+" "+age);
    }

}

class Employee extends Person{
    int salary;

    public Employee(String firstName, String lastName, int age,int salary) {
        super(firstName, lastName, age);
        this.salary=salary;

    }
}
class Tester extends Person{
    String programLan;
    public Tester(String firstName, String lastName, int age,String programLan) {
        super(firstName, lastName, age);
        this.programLan=programLan;



    }
}
class PersonTester{
    public static void main(String[] args) {
        Employee e1=new Employee("Joe", "Smith",35, 3500);
        e1.printInfo();


        Tester t1=new Tester("Adam","Smith",15,"java");
        t1.printInfo();
    }
}
