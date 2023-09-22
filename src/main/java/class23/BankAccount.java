package class23;

public class BankAccount {
    private String name;
    final private long backAcctNumber;
    private double balance;
    final private String userName;
    private String password;
    final private String acctType;

    public BankAccount(String name, long backAcctNumber, double balance,
                       String userName, String password, String acctType) {
        this.name = name;
        this.backAcctNumber = backAcctNumber;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.acctType = acctType;
    }
    public BankAccount(long backAcctNumber, String userName, String password,String acctType) {

        this.backAcctNumber = backAcctNumber;
        this.userName = userName;
        this.password = password;
        this.acctType= acctType;


    }
    public BankAccount(String userName,long backAcctNumber, String acctType){
        this.backAcctNumber = backAcctNumber;
        this.userName = userName;
        this.acctType = acctType;
    }
    public String getName(){//getter method, only to see what is store, READ ONLY, (get and name of the file)
        return name;//michelle
    }
    public long getBackAcctNumber(){//method
        return backAcctNumber;
    }
    void setName(String name){//method--set is to change
        this.name=name;
    }
    String getAcctType(){
        return acctType;
    }


}
