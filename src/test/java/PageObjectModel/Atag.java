package PageObjectModel;


import org.checkerframework.common.value.qual.EnsuresMinLenIf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Atag {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        List< WebElement> link= driver.findElements(By.tagName("a"));
        for(int i=0;i<=link.size()-1;i++){
           if(link.get(i).getText().equals("Mobiles")){
               link.get(i).click();
               break;
           }
        }

    }


}
