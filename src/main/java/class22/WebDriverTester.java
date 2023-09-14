package class22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTester {

    public static void main(String[] args) throws InterruptedException {
        //WebDriver w=new ChromeDriver();//class
        //WebDriver w = new EdgeDriver();//class
        WebDriver[] browsers = {new EdgeDriver(), new FirefoxDriver(), new ChromeDriver()};//this is poly


        for (WebDriver w : browsers) {
            w.manage().window().maximize();//manage is a method
            Thread.sleep(2000);
            w.navigate().to("https://amazon.com");
            Thread.sleep(2000);
            System.out.println(w.getTitle());
            Thread.sleep(2000);
            w.close();
        }

    }


}
