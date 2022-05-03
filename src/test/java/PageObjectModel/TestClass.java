package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        HomePage hpage=new HomePage(driver);
        //MobilesPage mpage = new MobilesPage(driver);
        MobilesPage mpage=hpage.clickonmobileslink();
        mpage.selectoneplus();
        Thread.sleep(20000);
        mpage.clickonfirstitem();

    }
}
