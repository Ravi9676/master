package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ehomepage {
    WebDriver driver;
    public Ehomepage(WebDriver driver){
        this.driver=driver;
    }
    public Electronicspage clickonelectronicspage(){
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()=' Electronics ']")).click();
        return new Electronicspage (driver);
    }


    }


