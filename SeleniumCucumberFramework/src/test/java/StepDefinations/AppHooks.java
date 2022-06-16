package StepDefinations;

import DriverFactory.Drivers;


import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class AppHooks {
    public WebDriver driver;
    @Before(order = 0)
    public void getdriver(){
        Drivers obj=new Drivers();
        driver=obj.Browser();
    }
}
