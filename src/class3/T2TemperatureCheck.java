package class3;
/*
create variable to store temp. your program should check if temp. is below 32 then it should print "water will
freeze with temp __" otherwise "water will not freeze with temp. __"
 */
public class T2TemperatureCheck {
    public static void main(String[] args) {

        double temp=25;

        if (temp<32){
            System.out.println("Water will freeze with temperature "+temp);
        } else {
            System.out.println("Water will Not freeze with temperature"+temp);
        }

    }
}
