package class5;

public class E10IfTurnToSwitch {
    public static void main(String[] args) {
        double day=7;// what we want to check if they dont match the default will happen

        if (day == 1) {
            System.out.println("Monday");
            // we need to add because it will not stop it will keep on answering
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");

            System.out.println("wrong day");
        } else {
            System.out.println("wrong day");
        }
    }
}
