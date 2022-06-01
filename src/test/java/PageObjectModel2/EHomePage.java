package PageObjectModel2;

import PageObjectModel.MobilesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EHomePage {
    WebDriver driver;
    public EHomePage(WebDriver driver){
        this.driver=driver;

    }
    public Electronicspage clickonelectronicspage(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
        return new Electronicspage(driver);

    }

}


