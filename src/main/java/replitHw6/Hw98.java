package replitHw6;

//Create a String given="Hello Syntax friends".
//
//Using String methods from given String create new String "Welcome Syntax family"
//
//**Expected Output:**
//
//```
//Welcome Syntax family
public class Hw98 {
    public static void main(String[] args) {

        String str="Hello Syntax friends";
        String newStr=str.replaceAll("Hello Syntax friends","Welcome Syntax family");
        System.out.println(newStr);



    }
}
