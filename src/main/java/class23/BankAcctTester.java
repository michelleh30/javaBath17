package class23;

public class BankAcctTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Michelle",12538956,5000,"user123","Pass123","Checking");
        System.out.println(b.getName());//michelle
        System.out.println(b.getBackAcctNumber());

       b.setName("Valentina");//calling the method
        System.out.println(b.getName());//valentina

    }
}
