package replitsHw8;
/*
Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)
 */
public class Hw159 {
    public int subtract(int num1, int num2,int num3, int num4){
        return num1-num2-num3-num4;
    }
    public int subtract(int num1, int num2,int num3){
        return num1-num2-num3;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }

    public static void main(String[] args) {
        Hw159 obj=new Hw159();

        System.out.println(obj.subtract(100,20,25,15)+ " (should come from subtracting 4 numbers)");


        System.out.println(obj.subtract(100,50,20)+ " (should come from subtracting 3 numbers )");


        System.out.println(obj.subtract(30,10)+ " (should come from subtracting 2 numbers)");

    }

}
