package class14;
//private is only that class
//defelt means

//b/c its private you can not accuss it

public class BankAccount {
    private String name="Michelle";
    private String userName="123GHD";
    private String password="pass123";
    private double accountBal=300;
    String accountNum="12345";

   private void printInfo(){
       System.out.println("I am Fahim from batch 17");
   }



    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
        System.out.println(bankAccount.accountNum);
    }



}
