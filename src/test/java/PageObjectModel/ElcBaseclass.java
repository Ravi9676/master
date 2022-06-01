package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElcBaseclass {
    WebDriver driver;
   public ElcBaseclass(WebDriver driver){
       this.driver=driver;
   }
    public void setupmethod() {
       System.setProperty("webdriver.chrome.driver", "E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
       ChromeDriver driver = new ChromeDriver();

    }
}
