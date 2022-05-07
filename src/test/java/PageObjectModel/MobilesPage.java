package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilesPage {
    public void launch(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\korni\\IdeaProjects\\Selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.findElement(By.xpath("//span[text()='OnePlus']")).click();
        driver.findElement(By.xpath("//div[@cel_widget_id=\"MAIN-SEARCH_RESULTS-1\"]//h2//span")).click();
        
    }
}
