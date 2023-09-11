package class13;
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects

 */
public class Task1SyntaxEmployee {
    static String CEO = "Sumair";

    int salary;
    String empId;

    public static void main(String[] args) {
        Task1SyntaxEmployee michelle=new Task1SyntaxEmployee();
        michelle.empId="I123";
        michelle.salary=45000;

        Task1SyntaxEmployee alex=new Task1SyntaxEmployee();
        alex.empId="h453";
        alex.salary=67432;

        System.out.println(alex.salary);
        System.out.println(Task1SyntaxEmployee.CEO);
        System.out.println(alex.CEO);
        System.out.println(michelle.CEO);




    }

}

