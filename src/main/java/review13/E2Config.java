package review13;
//IO exexcepetion is a parent of file not found
//final block :write a code that we want to run anyway
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Config.properites";
        //bring the data from the perment stoage to the ..

        try(FileInputStream fis = new FileInputStream(path);) {//complet line that varible

            Properties properties=new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("browser"));

        }catch (IOException io){//io is better to put because its the parent
            //problematic code
            System.out.println("Please check the file that you are trying to read");
            //send an email or report to the team
            //having backup code like create new if the one from above path is not found
        }

    }
}
