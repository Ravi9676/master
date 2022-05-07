package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    public void open(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\korni\\IdeaProjects\\Selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        WebElement mobileslink = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        mobileslink.click();
    }

}
