package Locators;

import org.openqa.selenium.By;

public interface Amazonhomepage {
   // By mobilexpath=By.xpath("//a[text()='Mobiles']");
    By todaydealsxpath=By.xpath("//a[contains(text(),'Today')]");
    //By alldealsxpath=By.xpath("//span[contains(text(),'All')and@class='nav-a-content']");
    By subscribexpath=By.xpath("//span[@class='nav-a-content' and contains(text(),'Subscribe')]");
    By healthxpath=By.xpath("//span[text()='Health & Personal Care']");
}
