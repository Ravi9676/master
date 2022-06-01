package OOPSConcepts;

//import org.junit.BeforeClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

    public static WebDriver driver;
    @BeforeSuite
    public static void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Amazon\\master\\Drivers\\chromedriver.exe");
        driver=new ChromeDriver();
    }



}
