package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;

/*
Create a property file to store following configurations:

browser=chrome
url=https://facebook.com/
username
password

Read file and extract values of browser & url
 */
public class Hw1 {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\hw1";

        //move the file from permanent to the RAM
        FileInputStream fis=new FileInputStream(path);//add exception

        //software that will assist us to read Write data from the file
        Properties properties=new Properties();

        //load the data from txt into the properties object
        properties.load(fis);

        System.out.println(properties.get("browser"));
        System.out.println(properties.get("userName"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));

    }
}
