package class12;

public class E2CalculatorTester {
    public static void main(String[] args) {
//we have created the obj of the calulator class
        Calculator calc=new Calculator();//this is the object of the class if we want to use the method
        //name of the class new name=new class name

        //to call the method using the obj of the class
        calc.add();//this is the method from the class that we did "calling the method"

        calc.subtract();

        calc.multiply(20,20);//you can change the number here without change the code // so this is parameter
        //cala.multiply();
    }
}
