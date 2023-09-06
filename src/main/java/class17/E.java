package class17;
//write program to inherit class E that has method printF which is static and
// call or reuse that method into class F
//a child can asscess everything but private
public class E {

    static String name="Michelle";
    static void printF(){
        System.out.println("f");
    }
}
class F extends E{
    public static void main(String[] args) {
        printF();
        System.out.println(name);
    }
}
