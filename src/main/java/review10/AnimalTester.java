package review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnimalTester {
    public static void main(String[] args) {

       /* Animal animal =new Animal();
        animal.speak();
        animal.eat();

        Dog dog=new Dog();
        dog.speak();
        dog.eat();

        Cat cat=new Cat();
        cat.eat();
        cat.eat();

        */
//*********************

        Animal [] arr={new Animal(), new Dog(), new Cat()};//this is better instend of the one up; this short arry is called poly this is poly

        for(Animal a:arr){
            a.eat();
            a.speak();
            //this gets all the answers
        }
//this is repeating a lot of code, all the methods are the same,
        //the only thing that is changing is obj
        //class or interface is Webdriver
        //just change the obj which is after new ""
        /*ChromeDriver c= new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        FirefoxDriver f= new FirefoxDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        EdgeDriver e=new EdgeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

         */

// this is better, less code, if using poly
        WebDriver [] webDrivers={new ChromeDriver(),new FirefoxDriver(), new EdgeDriver()};

        //if you dont know the size just use arrays
        for (int i = 0; i <webDrivers.length ; i++) {
            WebDriver w=webDrivers[i];//getting obj 1 by 1
            w.manage().window().maximize();
            w.get("https://www.amazon.com");
            System.out.println(w.getTitle());
            w.quit();

        }






    }
}
