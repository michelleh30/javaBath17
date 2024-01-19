package replitHw9;

/*
Step 1: Create Interface as Outputs
Step 2: Create one method with below details
- First Methods: return type void, method name display, parameters ->
result (choose the datatype as required)
Step 3: Create Interface as Functions
Step 4: Inherit to Output
Step 5: Create 4 methods as below.
- return type double, method label adding, parameters -> firstNumber , SecondNumber (choose the datatype as required)
- return type double, method label subtracting, parameters -> firstNumber , SecondNumber (choose the datatype as required)
- return type double, method label multiply, parameters -> firstNumber , SecondNumber (choose the datatype as required)
- return type double, method label dividing, parameters -> firstNumber , SecondNumber (choose the datatype as required)
Step 6: In Main Class inherit to Functions Interface.
Step 7: Provide implementation logic to  unimplemented methods.
Step 8: complete the body of all the methods as below
 */
interface Outputs {
    void display(double result);

}
interface Functions extends Outputs {
    double adding(double firstNumber, double secondNumber);

    double subtracting(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double dividing(double firstNumber, double secondNumber);

}
class Hw177 implements Functions{

    @Override
    public void display(double result) {
        System.out.println("Result is ::: " + result);
    }

    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public static void main(String[] args) {
        double firstNumber=100.00;
        double secondNumber=20.00;

        Hw177 hw=new Hw177();
        hw.display(hw.adding(firstNumber,secondNumber) );
        hw.display(hw.subtracting(firstNumber,secondNumber));
        hw.display(hw.multiply(firstNumber,secondNumber));
        hw.display(hw.dividing(firstNumber,secondNumber));


    }
}
