package class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Excetions {
    public static void main(String[] args) {

        String path=null;

        try{
            FileInputStream fis=new FileInputStream(path);
        }catch(FileNotFoundException e){
            System.out.println("hehehe");
        }

    }
}
