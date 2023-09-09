package class19;

//method overload
public class Calculator {

    public void add(int num1, int num2) {//this is a diff method
        System.out.println(num1 + num2);
    }

    public void add(int num1, int num2, int num3) {//signature of a method the name of the method and..1hr into the class
        System.out.println(num1 + num2 + num3);
    }

    public void add(double num1, double num2) {
        System.out.println(3);
        System.out.println(num1 + num2);

    }
    public void add(int num1, double num2){
        System.out.println(4);
        System.out.println(num1+num2);
    }

    public void add(double num1, int num2) {
        System.out.println(5);
        System.out.println(num1 + num2);
    }

}
