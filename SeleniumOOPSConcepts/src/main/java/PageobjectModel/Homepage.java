package PageobjectModel;

import OOPSConcepts.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BaseClass {
    public WebDriver driver;
    private  static String mobilesxpath="";
    public  Homepage(WebDriver driver){
        this.driver=driver;
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public void clickOnMobileslink(){
        driver.findElement(By.xpath(mobilesxpath)).click();
    }
}
