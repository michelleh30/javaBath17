package class5;

public class E2Operator {
    public static void main(String[] args) {
        //* write a program that check if the country is NOT equal to Iran
        // its says you are allowed
        // ! use that and for the opposite
        String country="Bolivia";

        if(!country.equals("Iran")){
            System.out.println("Welcome you are allowed");
        }else{
            System.out.println("You are not allowed");
        }

    }
}
