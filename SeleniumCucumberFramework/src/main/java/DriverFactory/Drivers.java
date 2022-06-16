package DriverFactory;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {
    public  WebDriver driver;

    public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();
    public WebDriver  Browser(){
        System.setProperty("webdriver.chrome.driver","C:\\Amazon\\master\\Drivers\\chromedriver.exe");
        tldriver.set(new ChromeDriver());
        //driver=new ChromeDriver();
        return getDriver();
    }

    public static synchronized WebDriver getDriver(){

        return tldriver.get();
    }
}
