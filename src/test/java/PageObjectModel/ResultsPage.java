package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ResultsPage {
    ChromeDriver driver;
    public ResultsPage(ChromeDriver driver){
        this.driver=driver;

    }

    public  boolean verifyResult(String text){
        String itemname=driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']")).getText();
        ArrayList<String> allwins=new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allwins.get(1));
        if(itemname.contains(text)){
            return  true;
        }
        else {return  false;}
    }

}
