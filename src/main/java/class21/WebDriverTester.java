package class21;

//use poly
//crate an array
//then write a loop
public class WebDriverTester {

    public static void main(String[] args) {
        WebDriver[] arr = {new ChromeDriver(), new FireDriver()};//array
        for (WebDriver d : arr) {//loops
            d.openBrowser();//same method giving different output; polymorphism is many forms of methods
            d.loadURL("Amazon.com");
            d.performTesting();
            d.close();
        }

    }
}
