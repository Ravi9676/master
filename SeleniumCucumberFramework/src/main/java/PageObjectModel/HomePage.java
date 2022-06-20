package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public WebDriver driver;
    public  HomePage(WebDriver driver){

        this.driver=driver;
    }

    public  void launchUrl(String url){

        driver.get(url);
    }
}
