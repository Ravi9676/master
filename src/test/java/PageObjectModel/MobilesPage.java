package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobilesPage {
    ChromeDriver driver;
    public MobilesPage(ChromeDriver driver){
        this.driver=driver;

    }
    public void selectoneplus(){
        driver.findElement(By.xpath("//span[text()='OnePlus']/..//i")).click();
    }
    public String clickonfirstitem(){
        String text=driver.findElement(By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-1']//h2//span")).getText();
        driver.findElement(By.xpath("//div[@data-cel-widget='MAIN-SEARCH_RESULTS-1']//h2//span")).click();
        return  text;

    }
}
