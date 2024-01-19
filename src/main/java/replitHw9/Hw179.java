package replitHw9;
/*
Create Class EncapsulationDemo that will have 2 variables empName and empAge;
Create the getter/setter methods for each variable.
In Main Class and main method
Using setter methods assign the values as "Mario" and "32"
Using getter methods print the values as below outputs.
 **Expected Output:**
Employee Name: Mario
Employee Age: 32
 */
public class Hw179 {
    private String empName;
    private int empAge;

    Hw179 (String empName, int empAge){
        this.empName=empName;
        this.empAge=empAge;
    }
    //getter method
    public String getEmpName(){
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }

    //set method
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }

    public static void main(String[] args) {
        Hw179 h=new Hw179("Mario",32);
        System.out.println("Employee Name: " + h.getEmpName());
        System.out.println("Employee Age: " + h.getEmpAge());
    }
}
