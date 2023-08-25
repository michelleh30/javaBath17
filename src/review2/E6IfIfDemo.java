package review2;

public class E6IfIfDemo {
    public static void main(String[] args) {

        int age=50;
        if(age>60){
            System.out.println("you get 20% discount");
        }
        else if(age>50){
            System.out.println("you get 15% discount");
        }
        else if(age>40){
            System.out.println("you get 10% discount");
        }
        else {
            System.out.println("no discount for you. please try after 10 years");
        }
    }
}
