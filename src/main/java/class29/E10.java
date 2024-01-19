package class29;
//this is how it used to be done
import class21.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E10 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream FileInputStream = new FileInputStream("C:\\User\\Syntax\\Desktop\\Batch 17\\salaries.xlsx");

        } catch (FileNotFoundException f) {
            System.out.println("Plese check the file path");
        } finally {
            try {
                if(fileInputStream!=null)
                    fileInputStream.close();
            } catch (IOException e) {
                System.out.println(e);

            }

        }


    }
}
