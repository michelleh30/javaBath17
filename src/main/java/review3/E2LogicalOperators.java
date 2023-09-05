package review3;
// as long your getting your protein it would be true
public class E2LogicalOperators {
    public static void main(String[] args) {

        boolean isMeat=false;
        boolean isEgg=true;
        boolean isFish=false;
        boolean isMilk=false;// this would not be a good balance diet
        boolean veggies=true;

        boolean isProtein=isEgg||isMeat||isFish;
        boolean isGoodDiet=(isEgg||isMeat||isFish) && isMilk&&veggies;// this makes a good diet, so its true
        System.out.println(isProtein);
        System.out.println(isGoodDiet);

    }
}
