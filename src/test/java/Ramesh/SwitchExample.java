package Ramesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SwitchExample {
    public static void main(String[] args) {
        String browsername="chrome";
        WebDriver driver;
        switch (browsername)
        {
            case "chrome":
                System.out.println("Chromebrowser");
                //driver=new ChromeDriver();System.out.println("IE");
                break;
            case "IE":
                System.out.println("IE");
                //driver=new InternetExplorerDriver();
                break;
            case "safari":
                //driver=new SafariDriver();
                System.out.println("safari");
                break;
            case "Firefox":
                //driver=new FirefoxDriver();
                System.out.println("Firefox");
                break;
            default:
                //driver =new ChromeDriver();
                System.out.println("ChromeDriver");
        }
    }
}
