package class27;
//reading data from a file
//no one can see the private information
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //locate the file which is Config.properties
        //hard coding
        //String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Config.properites";//inside the permanent storage

        //do this so that its easrier for the user becuase they can use it bc we all have diff locations/path
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //System.out.println(path);

        //move the file from permanet storage into the RAM
        FileInputStream fis=new FileInputStream(path);//add exception

        //that one class/software that will assist us to read Write data from the file
        Properties properties=new Properties();

        //load the data from txt into the properties object
        properties.load(fis);

        System.out.println(properties.get("userName"));//James
        System.out.println(properties.get("password"));//pass123
        System.out.println(properties.get("URL"));//amazon.com

        //this line here gives the location of your intellij project on your computer
        System.out.println(System.getProperty("user.dir"));//get the C:\Users\mdh26\IdeaProjects\javaBath17
        //java auto figure it out which location your project is store

    }
}
