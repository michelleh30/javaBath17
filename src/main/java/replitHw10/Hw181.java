package replitHw10;
/*
Create Class Account
Create the below variables:
- acc_no;
- name;
- email;
- double amount;

Create the getter/setter methods for each variable.
In Main Class and the main method.
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntax.com
amount = 50000.0
Using getter methods print the values as below output.
**Expected Output:**
7560504000 Sumair sumair@syntax.com 50000.0
 */
public class Hw181 {
    private long acc_no;
    private String name;
    private String email;
    private double amount;

    Hw181(long acc_no, String name,String email, double amount){
        this.acc_no=acc_no;
        this.name=name;
        this.email=email;
        this.amount=amount;
    }
    //getter method
    public long getAcc_no(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getAmount(){
        return amount;
    }
    //set method

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
        Hw181 hw=new Hw181(7560504000L,"Sumair","sumair@syntax.com",50000.0);
        System.out.println(hw.getAcc_no()+" " + hw.getName() +" " + hw.getEmail() + " "+ hw.getAmount());
    }
}
