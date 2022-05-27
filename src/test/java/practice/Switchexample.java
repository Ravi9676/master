package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Switchexample {


    public static void main(String[] args) {
        String browsername="chromefe";
        WebDriver driver;
        switch(browsername)
        {
            case "chrome":
                System.out.println("chromedriver");
                break;
                //driver=new ChromeDriver();
            case "IE":
                System.out.println("IEdriver");
                break;
                // driver=new InternetExplorerDriver();
            case  "Firefrox":
                System.out.println("Firefroxdriver");
                break;
                //driver=new FirefoxDriver();
            case "safari":
                System.out.println("safaridriver");
                break;
                //driver=new SafariDriver();
            default:
                //driver=new ChromeDriver();
                System.out.println("chromedriver");

        }
    }

}
