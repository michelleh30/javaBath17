package replitHw10;
/*
Encapsulation
- firstname
- lastname
- birthmonth
- birthday
- birthyear
- String ssn

**Constructor**
The main constructor should take in all values and assign them to their respective private class variables
**Methods**
create a public getters to access all the variables.
**Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.
For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"**
in Main Class.
Instantiate and object of Person and provide values. follows below outputs for values.
using getter and method print them separately.
**Note: Read carefully the steps.**
**Expected Output:**
John
Doe
10/25/1900
123-45-6789
 */
public class Hw182 {
    private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;

    Hw182(String firstname, String lastname, int birthmonth,int birthday,int birthyear, String ssn){
        this.firstname=firstname;
        this.lastname=lastname;
        this.birthmonth=birthmonth;
        this.birthday=birthday;
        this.birthyear=birthyear;
        this.ssn=ssn;
    }

    //getter method to get private variables
    public String getFirstname(){
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }
    //method for format birthday
    public String formatBirthday(){
        return birthmonth + "/" + birthday + "/" + birthyear;
    }

    public static void main(String[] args) {
        Hw182 hw = new Hw182("John", "Doe", 10, 25, 1990, "123-45-6789");
        //getter method to print out
        System.out.println(hw.getFirstname());
        System.out.println(hw.getLastname());
        System.out.println(hw.formatBirthday());
        System.out.println(hw.getSsn());
    }
}
