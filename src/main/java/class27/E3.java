package class27;
/*user.dir gives you the adderss of your project
your user.dir is different from mine , so it will be unique for everyone, that's why it's better to do user.dir
line 42--is to bring the file from the permanent memory to the ram
43 is a call for Properties class and creating prop obj to use it to load the file

 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E3 {
    public static void main(String[] args) throws IOException {

        //String path=System.getProperty("user.dir")+"\\Files\\Config.properties";// gives url of the project
        //FileInputStream fis=new FileInputStream(path);
        //Properties prop=new Properties();
       // prop.load(fis);//always need to do this

        String url=getProperty("URL");
        String userName=getProperty("userName");
        String password=getProperty("password");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //going to nag to the url
        driver.get(url);

        //locate the text filed
        WebElement userNameFile= driver.findElement(By.id("txtUsername"));
        //enter the text into the field
        userNameFile.sendKeys(userName);//Admin

        WebElement passwordField= driver.findElement(By.id("txtPassword"));
        passwordField.sendKeys(password);

        WebElement loginBtn= driver.findElement(By.id("btnLogin"));
        loginBtn.click();


        //String value = getProperty("password");
        //System.out.println(value);
    }

    public static String getProperty(String propKey) throws IOException {
        //method for reading the data from a file
        //making a method-- going inside the congif.properties and give you the code
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";// gives url of the project
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        //return the value of the property that we provide in the parameter
        String value=prop.getProperty(propKey);
        return value;
    }
}
