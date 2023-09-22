package projectCodes2;
/*
Task 10
We have to calculate the average of marks obtained in three subjects
by student A and by student B.
Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
public class Registration {
    private String email;
    private String userName;
    private String password;
    public Registration(String email, String username, String password) {
        setEmail(email);
        setUserName(username);
        setPassword(password);
    }
    public void setEmail(String email) {

        if (email.contains("yahoo")){
            this.email = email;
        }else{
            System.out.println("not a accepted email provider");
        }
    }

    public void setUserName(String userName) {

        if(!userName.isEmpty()&& userName.length()>6){
            this.userName = userName;
        }else{
            System.out.println("Username does not meet requirements.");
        }
    }

    public void setPassword(String password) {

        if(!password.isEmpty()&& password.length()>6&& password!=userName){
            this.password = password;
        }else{
            System.out.println("Password does not meet requirements.");
        }
    }

    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        class23.Registration r = new class23.Registration("michelle@yahoo.com", "User123", "Pass123");


        System.out.println("Email: " + r.getEmail());
        System.out.println("Username: " + r.getUsername());
        System.out.println("Password: " + r.getPassword());
    }
}


