package class29;
//new way of doing it
// try with resourse
//IOException is the parent of file not found exception
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E11Exceptions {

    public static void main(String[] args) {

        //why we out it in () bc java is going to close the file
        //its opening and closing
        try(FileInputStream FileInputStream = new FileInputStream("C:\\User\\Syntax\\Desktop\\Batch 17\\salaries.xlsx")) {


        } catch (IOException f) {
            System.out.println("Plese check the file path");
        }
    }
}
