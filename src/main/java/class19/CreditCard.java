package class19;

public class CreditCard {

    private double balance;
    private double interest;

    public CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double totalInterest = balance * interest * 100;
        System.out.println(totalInterest);
    }
}

class Visa extends CreditCard {

    // @Override

    Visa(double balance, double interest) {
        super(balance, interest);
    }

    public void calculateInterest() {
        super.calculateInterest();
    }
}

class AX extends CreditCard {

    AX(double balance, double interest) {
        super(balance, interest);
    }

    // @Override
    public void calculateInterest() {
        super.calculateInterest();
    }
}

class TesterCreditCard {
    public static void main(String[] args) {
        CreditCard obj = new CreditCard(150, 3.2);
        obj.calculateInterest();
        Visa obj1 = new Visa(450, 2.1);
        obj1.calculateInterest();
        AX obj2 = new AX(10, 2.4);
        obj2.calculateInterest();
    }

}




