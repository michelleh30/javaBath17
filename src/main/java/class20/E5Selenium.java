package class20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();


        EdgeDriver edge = new EdgeDriver();
        edge.manage().window().maximize();
        Thread.sleep(2000);
        edge.navigate().to("https://google.com");
        System.out.println(edge.getTitle());
        Thread.sleep(2000);
        edge.navigate().to("https://facebook.com");
        System.out.println(edge.getTitle());
        Thread.sleep(2000);
        edge.navigate().to("https://amazon.com");
        System.out.println(edge.getTitle());
        Thread.sleep(2000);
        edge.navigate().back();
        edge.close();

    }


}

