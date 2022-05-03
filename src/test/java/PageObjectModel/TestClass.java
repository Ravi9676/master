package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static void main(String[] args) {
        System.setProperty("WebDriver.Chrome.Driver","E:\\IntelliJ IDEA Community Edition 2022.1\\Amazon\\master\\Drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        HomePage hpage=new HomePage(driver);
    }
}
