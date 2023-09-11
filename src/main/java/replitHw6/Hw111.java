package replitHw6;
/*
Create one method as syntaxTechnologies and write the logic for that method in
println statement as "Welcome to Syntax Technologies!"

2. Create another method as syntaxStudents and write the logic for that method in
 println statement as "Welcome Syntax Students!"

3. Call both methods
 */
public class Hw111 {
    /*
    public static void main(String[] args) {

        String syntaxTechnologies=new String("Welcome to Syntax Technologies!");
        System.out.println(syntaxTechnologies);

        String syntaxStudents=new String("Welcome Syntax Students!");
        System.out.println(syntaxStudents);

         */

    void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }
    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }

    public static void main(String[] args) {
            Hw111 s=new Hw111();
        s.syntaxTechnologies();
        s.syntaxStudents();
    }

}
