package class12;
//create a method that will take two int numbers as input
//and return the larger number call the method in a different class
// and print the results
public class T2Methods {

    int largerNum(int num1,int num2){
        int result;

        if(num1>num2){
            result=num1;
        }else{
            result=num2;
        }

        return result;

    }
}
