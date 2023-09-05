package class13;

public class E1LocalVar {

    String country="USA";//instance var.

    public static void main(String[] args) {
        String name="michelle";

        if(10>5){// {} this define the block of code
            int age=23;//this is local var
            System.out.println(name);//works b/c its inside the block of code
            System.out.println(age);//b/c this is outside the block its not going to work

        }
        // System.out.println(age);//b/c this is outside the block its not going to work
        System.out.println(name);//this works b/c its inside the code

    }


}
