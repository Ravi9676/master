import Locators.Amazonhomepage;
import Locators.DragandDropLocators;
import Locators.Flipkart;
import Locators.HomepagrLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Actionsconcept implements HomepagrLocators,DragandDropLocators, Flipkart, Amazonhomepage {
    public static WebDriver driver;

    /* @Test
     public void mousemoment(){
         System.setProperty("webdriver.chrome.driver","C:\\Amazon\\master\\Drivers\\chromedriver.exe");
         driver=new ChromeDriver();
         //driver.get("https://www.myntra.com/");
        // driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
          // driver.get("https://www.flipkart.com/");
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
       //  dragAndDropmethod(sourcexpath,destinationxpath);
         // flipkartmethod(electronicsxpath,audioxpath,wiredheadphone);
         // flipkartclickandhold(electronicsxpath,audioxpath,wiredheadphone);
         //amazon(mobilexpath);
         amazonclickandhold(todaydealsxpath,subscribexpath,healthxpath);

        // myntra(menxpath,mentshirtsxpath);
         //myntraclickandhold(menxpath,mentshirtsxpath);
       //  myntra(womenxpath,womentshirtxpath);

         //myntra(kidsxpath,kidsboytshirtxpath);
         *//*
        myntra(homelivingxpath,festivedecorxpath);*//*
        //myntra(beautyxpath,kajalxpath);
       // myntra(studioxpath,explorestudioxpath);
*//*
        Actions bulider=new Actions(driver);
        bulider.moveToElement(getLocator(menxpath)).perform();
        getLocator(mentshirtsxpath).click();
*//*
    }*/
    public static WebElement getLocator(By locator) {

        return driver.findElement(locator);
    }

    public void myntra(By mainmenu, By submenu) {
        Actions bulider = new Actions(driver);
        bulider.moveToElement(getLocator(mainmenu)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getLocator(submenu).click();


    }

    public void dragAndDropmethod(By sourcexpath, By destinationxpath) {
        Actions bulider = new Actions(driver);
        bulider.dragAndDrop(getLocator(sourcexpath), getLocator(destinationxpath)).perform();
    }

    public void flipkartmethod(By mmenu, By smenu, By ssmenu) {
        Actions bulider = new Actions(driver);
        bulider.moveToElement(getLocator(mmenu)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        bulider.moveToElement(getLocator(smenu)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getLocator(ssmenu).click();

    }

    public void amazon(By locator) {
        Actions bulider = new Actions(driver);
        bulider.contextClick(getLocator(locator)).perform();
    }

    public void myntraclickandhold(By menu, By submenu) {
        Actions bulider = new Actions(driver);
        bulider.moveToElement(getLocator(menu)).perform();
        bulider.clickAndHold(getLocator(submenu)).perform();
    }

    public void flipkartclickandhold(By menu, By submenu, By ssmenu) {
        Actions bulider = new Actions(driver);
        bulider.moveToElement(getLocator(menu)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        bulider.clickAndHold(getLocator(submenu)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        bulider.clickAndHold(getLocator(ssmenu)).perform();
    }

    public void amazonclickandhold(By m, By s, By ss) {
        Actions bulider = new Actions(driver);
        getLocator(m).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        getLocator(s).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        bulider.clickAndHold(getLocator(ss)).perform();

    }

    /* @BeforeMethod
     public void beforemethod(){
         System.out.println("beforemethod");
     }
     @BeforeTest
     public void beforetest(){
         System.out.println("beforetest");
     }
     @Test
     public void test1(){
         System.out.println("test1");
     }
     @Test
     public void test2(){
         System.out.println("test2");
     }
     public void test3(){
         System.out.println("test3");
     }*/
    @Test
    public void homepagedisplay() {
        System.setProperty("webdriver.chrome.driver", "C:\\Amazon\\master\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        verifyhomepagedisplay(mobilexpath);
        //driver.get("https://www.flipkart.com/");
      //  flipkarthomepage(electronicsxpath);
        driver.manage().window().maximize();
    }
    public boolean verifyhomepagedisplay(By locator) {
        boolean display = driver.findElement(locator).isDisplayed();
        if (display == true) {
            System.out.println("homepage is displayed");
            return true;
        }
        else {
            System.out.println("homepage is not displayed");
            return false;
        }

    }
   /* public void flipkarthomepage(By locator){
        boolean display=driver.findElement(locator).isDisplayed();
        if(display==true){
            System.out.println("displayed");
        }
        else{
            System.out.println("not displayed");
        }
    }*/
}

