package class10;

public class T2 {
    public static void main(String[] args) {
        String userName="student123";
        String passWord="Pass1234";
        String confirmPassword="Pass1234";

        if(userName.isEmpty()||passWord.isEmpty()){
            System.out.println("User or Passowrd cannot be empty");
        }else if(passWord.length()<8){
            System.out.println("Password is too short");
        }else if(passWord.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!passWord.equals(confirmPassword)){
            System.out.println("Password does not match");
        }else{
            System.out.println("Your user and password has be created");
        }

    }
}
