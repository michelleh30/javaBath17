package class19;

/*Create a class CreditCard Create an instance method that will calculate
interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes

 */
public class CreditCard2 {
    public void calInterest(double balance) {
        System.out.println(balance * 0.05);
    }
}

class Visa1 extends CreditCard2 {

}

class AX1 extends CreditCard2 {
    @Override
    public void calInterest(double balance) {
        System.out.println(balance * 0.07);
    }




    public static void main(String[] args) {
        CreditCard2 c = new CreditCard2();
        c.calInterest(100);
        Visa1 v = new Visa1();
        v.calInterest(100);
        AX1 ax=new AX1();
        ax.calInterest(100);

    }
}
