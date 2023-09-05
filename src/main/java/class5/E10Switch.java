package class5;

public class E10Switch {
    public static void main(String[] args) {

        int day=5;// what we want to check if they dont match the default will happen

        switch (day){
            case 1:
                System.out.println("Monday");
                break;// we need to add because it will not stop it will keep on answering
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("wrong day");
        }

    }
}
