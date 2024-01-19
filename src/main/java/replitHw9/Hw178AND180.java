package replitHw9;
/*
Create Class EncapsulationDemo
create two variable as shown below.
private String empName;
private int empAge;
Create the getter/setter methods for each variable.
In Main Class and main method.
Using setter methods assign the values as "John" and "30"
Using getter methods print the values as below outputs.
**Expected Output:**
Employee Name: John
Employee Age: 30
 */
public class Hw178AND180 {
    private String empName;
    private int empAge;

    Hw178AND180(String empName, int empAge){
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
       Hw178AND180 h=new Hw178AND180("John",30);
        System.out.println("Employee Name: " + h.getEmpName());
        System.out.println("Employee Age: " + h.getEmpAge());
    }
}

