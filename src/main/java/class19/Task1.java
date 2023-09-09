package class19;
//Create a method to find the minimum of two numbers.
// Method will be passed two parameters and will return the minimum
//number. Method should work with int and double data types.
//Examples
//min(10,5)=>5
//min(2.5,3.5)=>2.5
public class Task1 {
    public void mini(int num1,int num2){
        if (num1<num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
    public void mini(double num1,double num2) {
        if (num1 < num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
