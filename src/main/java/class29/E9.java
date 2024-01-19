package class29;
//always try to write a try catch block
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E9 {
    public static void main(String[] args) {
        E9 e=new E9();
        e.readFile();
    }
    void readFile() {
        read();
    }
    void read() {
        try{
            FileInputStream fis=new FileInputStream("C://kdrfh");
        }catch (FileNotFoundException f){

        }

    }
}
