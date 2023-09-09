package class18;
//Write program: User that has a constructor that initializes instance variable name
// and mobile number. Create a subclass/child class  userInfo that will have user address variable
// and it also being initialized through constructor call. Print users name, mobile number and address
// in userDetails method. Test your code.
public class UserClass {
    protected String name;
    protected String phone;

    public UserClass(String name,String phone){
        this.name=name;
        this.phone=phone;
    }

}
class userInfo extends UserClass{
    private String address;
    public userInfo(String name,String phone,String address){
        super(name,phone);
        this.address=address;

}
    void printInfo(){
        System.out.println(name+" "+phone+" "+address);
    }
}
class UserTester{
    public static void main(String[] args) {
        userInfo u1=new userInfo("Michelle","7039736675","6123 vista dr");
        u1.printInfo();
    }
}
