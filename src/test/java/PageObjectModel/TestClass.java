package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        HomePage hpage=new  HomePage(driver);
        ResultsPage rspage=new ResultsPage(driver);
        //MobilesPage mpage = new MobilesPage(driver);
        MobilesPage mpage=hpage.clickonmobileslink();
        mpage.selectoneplus();
        Thread.sleep(20000);
        String itemname=mpage.clickonfirstitem();
        boolean result=rspage.verifyResult(itemname);
        if(result==false){
            System.out.println("Test case failed");
        }
        else {System.out.println("Test case passed");}


    }
}
