package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Forloop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Amazon\\master\\Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        List<WebElement> elements=driver.findElements(By.tagName("a"));
        for(int i=0;i<=elements.size()-1;i++){
            if (elements.get(i).getText().equals(" Electronics ")){
                elements.get(i).click();
                break;
            }
         //  System.out.println(elements.get(i).getText());
        }
    }
}
