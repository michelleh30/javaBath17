package projectCodes2;

import org.openqa.selenium.firefox.FirefoxDriver;

/*
Provide Implementation for the diagram below. Then create a test class
in which you need to create Objects of ChromeDriver, FirefoxDrive and
SafariDriver classes and see which methods available to them
 */
interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void nevigate();

}
interface TakesScreenShot extends WebDriver{
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome Browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void nevigate() {

    }
}
class FireFox implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening FireFox");
    }

    @Override
    public void close() {
        System.out.println("Closing FireFox Browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void nevigate() {

    }
}
class EdgeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open EdgeDriver Browser");
    }

    @Override
    public void close() {
        System.out.println("Close the EdgeDriver Browser");

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void nevigate() {

    }
}
class WedDriverTester{
    public static void main(String[] args) {
        WebDriver[] browsers ={new ChromeDriver(), new FireFox(),new EdgeDriver()};
        for(WebDriver b:browsers){
            b.open();
            b.getTitle();
            b.close();

        }
    }
}
