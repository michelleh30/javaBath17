package class29;
//can have one try block and multi catch block
//excetions is the parent of all the errors
public class E7TryCaught {
    public static void main(String[] args) {

        System.out.println("1");


        //so if no exceptions happen in try block then it will output the try block
        try {
            //place the code that might throw exception--problematic code
            //System.out.println(10/0);//aritmetic error
            //String name=null;
            //name.length();
            int[] arr=new int[-5];

        }catch (ArithmeticException e){//doesnt matter the exceptions print this out
            System.out.println("Dont divide by zero");
        }
        catch (NullPointerException e){//name of the excetion
            System.out.println("Check if you stored the null value in the variable");
        }
        catch (Exception e){//this is the parent of all the excetion/errors
            System.out.println("Something went wrong contact help");
        }
    }
}
