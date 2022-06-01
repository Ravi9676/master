package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class HomePage {
    ChromeDriver driver;
    public HomePage(ChromeDriver driver){
        this.driver=driver;

    }
    public MobilesPage clickonmobileslink()
    {

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
        return new MobilesPage(driver);

    }
}
