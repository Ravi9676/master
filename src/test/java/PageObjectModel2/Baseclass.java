package PageObjectModel2;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
    WebDriver driver;
    public Baseclass(WebDriver driver){
        this.driver=driver;

    }
    public void setupDriver(){
        System.setProperty("webdriver.chrome.driver","E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
    }
}
