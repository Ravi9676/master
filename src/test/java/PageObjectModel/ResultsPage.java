package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResultsPage {
    ChromeDriver driver;
    public ResultsPage(ChromeDriver driver){
        this.driver=driver;

    }

    public  boolean verifyResult(String text){
        String itemname=driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']")).getText();
        if(itemname.contains(text)){
            return  true;
        }
        else {return  false;}
    }

}
