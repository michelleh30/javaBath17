package replitHw6;
/*Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30

2. for multiplication multiply two numbers to make 30

3. for Subtraction subtract two numbers to equal 20

 */
public class Hw114 {
    int multiply(int num1,int num2) {
        int res = num1 * num2;
        return res;

    }
    int add(int num1,int num2) {
        int result = num1 + num2;

        return result;
    }
    int sub(int num1,int num2){
        int result=num1-num2;
        return result;
    }

    public static void main(String[] args) {
        Hw114 a=new Hw114();
        int multi=a.multiply(3,10);
        System.out.println("Multiplication"+" "+multi);

        Hw114 b=new Hw114();
        int sum=b.add(20,10);
        System.out.println("Addition"+" "+sum);

        Hw114 c=new Hw114();
        int sub=c.sub(30,10);
        System.out.println("Subtraction" + " "+sub);
    }


}
