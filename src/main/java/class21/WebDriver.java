package class21;
//pareant class is giving the idea
public abstract class WebDriver {
    abstract void openBrowser();//methods
    abstract void loadURL(String url);//its method that has parameter
    abstract void performTesting();
    abstract void close();
}
class ChromeDriver extends WebDriver{//need to implament the methods--or make the class abstract
    @Override
    void openBrowser() {
        System.out.println("Opening the Google Chrome");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL"+url);
    }

    @Override
    void performTesting() {
        System.out.println("Performing testing");

    }

    @Override
    void close() {
        System.out.println("CLosing the Chrome browser");

    }

}
class FireDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening FireFox");
    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url in FireFox");

    }

    @Override
    void performTesting() {
        System.out.println("Performing testing on FireFox");

    }

    @Override
    void close() {
        System.out.println("Closing the browser");

    }
}
